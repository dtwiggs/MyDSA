class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[] currRow = new int[rows];
        int[] prevRow = new int[rows];
        currRow[cols - 1] = 1;
        prevRow[cols - 1] = 1;

        for(int r = rows - 1; r >= 0; r--){
            for(int c = cols - 1; c >= 0; c--){
                if(obstacleGrid[r][c] == 1){
                    currRow[c] = 0;
                } else if(c == cols - 1){
                    currRow[c] = prevRow[c];
                } else{
                    currRow[c] = prevRow[c] + currRow[c + 1];
                }
            }
            prevRow = currRow;
        }

        return currRow[0];
    }
}