/*
git reset --hard
git clean -fd
git pull
*/
import java.util.*;
@SuppressWarnings("unused")

class Solution {
    int rows, cols;

    public int countPaths(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        rows = grid.length;
        cols = grid[0].length;
        if(grid[rows - 1][cols - 1] == 1){
            return 0;
        }

        return dfs(grid, 0, 0, 0);
    }

    private int dfs(int[][] grid, int r, int c, int res){
        if(r == rows - 1 && c == cols - 1){
            return 1;
        } else if(r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 1){
            return 0;
        }

        res += dfs(grid, r + 1, c, res);
        res += dfs(grid, r - 1, c, res);
        res += dfs(grid, r, c + 1, res);
        res += dfs(grid, r, c - 1, res);

        return res;
    }
}