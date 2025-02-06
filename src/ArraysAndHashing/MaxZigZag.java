package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxZigZag {
    public int maxZigZag(int[] books){
        // No zigzags possible
        if(books.length <= 1){
            return 0;
        }

        // I am going to add +1 to res every change of direction
        // Start at -1 so when the first book gets placed, res = 0
        int res = -1;

        // Contains book height and the # of occurrences
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Iterate through the books once to put values in hashmap
        for(int i = 0; i < books.length; i++){
            if(!freq.containsKey(books[i])){
                freq.put(books[i], 1);
            } else{
                freq.put(books[i], freq.get(books[i]) + 1);
            }
        }

        // If all the books are the same size
        if(freq.size() == 1){
            return 0;
        }

        // keys[] is an array of the keys of the hashmap
        // We need it so we can access the hashmap values
        int[] keys = new int[freq.size()];
        int tmp = 0;
        for(Map.Entry<Integer, Integer> curr : freq.entrySet()){
            keys[tmp] = curr.getKey();
            tmp++;
        }
        Arrays.sort(keys);

        // Going to use two pointers to iterate us through the hashmap
        // We will decrement the values after "placing" them in our new bookshelf
        // res gets incremented by 2 each time as 
        int lf = 0;
        int rt = keys.length - 1;
        boolean check = false;
        while(lf < rt){
            freq.put(keys[lf], freq.get(keys[lf]) - 1);
            freq.put(keys[rt], freq.get(keys[rt]) - 1);
            res += 2;


            if(freq.get(keys[lf]) == 0){
                lf++;
                check = false;
            }
            if(freq.get(keys[rt]) == 0){
                rt--;
                check = true;
            }
        }

        // Edge cases: when we have leftover books
        if(lf == rt){
            if(check){ // Left with books smaller than the last placed book
                if(freq.get(keys[lf]) == 1){ // Can just put at end, res + 1
                    res++;
                } else if(freq.get(keys[lf]) == 2){ // Two leftover, put one at end and one at front, res + 2
                    res += 2;
                } else{
                    // Otherwise, put one at the front and back like last time, res + 2
                    // Then, we can put the remaining books in between what we already placed
                    // but, we must -1 from that, as we will have an up up or down down, not a zigzag.
                    // Math.min() because we are bottlenecked by either books left over, or spaces to put them in
                    res += 2;
                    freq.put(keys[lf], freq.get(keys[lf]) - 2);
                    res += Math.min(freq.get(keys[lf]) - 1, books.length - freq.get(keys[lf]) - 3);
                }
            } else{ // Left with extras of the last placed book
                if(freq.get(keys[lf]) == 1){
                    res++;
                } else{
                    // Same as above, but only res + 1 because we can only get an extra zig at the start
                    res ++;
                    freq.put(keys[lf], freq.get(keys[lf]) - 1);
                    res += Math.min(freq.get(keys[lf]) - 1, books.length - freq.get(keys[lf]) - 2);
                }
            }
        }

        return res;
    }
}
