/*
git reset --hard
git clean -fd
git pull
*/

import java.util.*;

@SuppressWarnings("unused")
class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length == 1){
            return 1;
        } else if(n == 0){
            return tasks.length;
        }

        int[] freq = new int[26];
        for(int i = 0; i < tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                heap.add(freq[i]);
            }
        }

        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        while(!heap.isEmpty() || !queue.isEmpty()){
            res++;
            
            if(heap.isEmpty()){
                if(res >= queue.peek()[1]){
                    heap.add(queue.poll()[0]);
                    int[] tmp = new int[] {heap.poll(), res + n};
                    if(tmp[0] > 0){
                        queue.add(tmp);
                    } 
                }
            } else{
                int[] tmp = new int[] {heap.poll(), res + n};
                if(tmp[0] > 0){
                    queue.add(tmp);
                }
            }
        }
        return res;
    }
}