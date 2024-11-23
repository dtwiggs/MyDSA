import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;
import java.util.Set;

class MatrixBFS {
    Set<Integer> visit = new HashSet<>();

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1){
            return -1;
        } else if(grid.length == 1 && grid[0][0] == 0){
            return 1;
        }

        int row, col, length, index;
        int[] tmp;
        Queue<int[]> queue = new LinkedList<>();
        int[][] mod = {
            {-1, 0},  // Up
            {1, 0},   // Down
            {0, -1},  // Left
            {0, 1},   // Right
            {-1, -1}, // Up-Left
            {-1, 1},  // Up-Right
            {1, -1},  // Down-Left
            {1, 1}    // Down-Right
        };

        visit.add(0);
        queue.offer(new int[]{0, 0, 1});
        while(!queue.isEmpty()){
            tmp = queue.poll();
            row = tmp[0];
            col = tmp[1];
            length = tmp[2];

            for (int[] direction : mod) {
                int tmpRow = row + direction[0];
                int tmpCol = col + direction[1];
                index = tmpRow * n + tmpCol;
        
                if (tmpRow >= 0 && tmpRow < n && tmpCol >= 0 && tmpCol < n
                    && grid[tmpRow][tmpCol] == 0 && !visit.contains(index)) {
                        visit.add(index);
                        queue.offer(new int[] {tmpRow, tmpCol, length + 1});
                }
            }

            if(visit.contains(n * n - 1)){
                return length + 1;
            }
        }
        
        return -1;
    }
}