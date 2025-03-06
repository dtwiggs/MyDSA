/*
git reset --hard
git clean -fd
git pull
*/

import java.util.*;

@SuppressWarnings("unused")
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length, cols = matrix[1].length;
        List<Integer> res = new ArrayList<>(rows * cols);

        boolean atMaxR = false, atMaxC = false;
        int minR = 0, maxR = rows, minC = 0, maxC = cols, r = 0, c = 0;
        for(int val : res){
            val = matrix[r][c];


        }
        
        return res;
    }
}