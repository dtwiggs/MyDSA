import java.util.HashSet;
import java.util.Set;

class NumIslands {
    Set<Integer> coords = new HashSet<>();
    int rows;
    int cols;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int count = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == '1' && !coords.contains(r * rows + c)){
                    numIslandsRec(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    public void numIslandsRec(char[][] grid, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0' || coords.contains(r * rows + c)) {
            return;
        }

        coords.add(r * rows + c);
        // grid[r][c] = '0';
        numIslandsRec(grid, r - 1, c);
        numIslandsRec(grid, r + 1, c);
        numIslandsRec(grid, r, c - 1);
        numIslandsRec(grid, r, c + 1);
    }
}