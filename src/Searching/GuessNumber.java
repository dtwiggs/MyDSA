package Searching;
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 *

class GuessNumber {
    public int guessNumber(int n) {
        int s = 0;
        int e = n;
        int mid = s + (e - s) / 2;
        
        while(s < e){
            if(GuessGame(mid) < 0){ // Guess too high, choose lower bounds
                e = mid - 1;
                mid = s + (e - s) / 2;
            } else if(GuessGame(mid) > 0){ // Guess too low, choose higher bounds
                s = mid + 1;
                mid = s + (e - s) / 2;
            } else {
                return mid;
            }
        }

        return mid;
    }


}
    */