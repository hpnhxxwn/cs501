# 01 Matrix
### 57.91%
### Solution:
```
public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] dist = new int[m][n];
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else
                    dist[i][j] = Integer.MAX_VALUE;
            }
        }
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = cell[0] + dir[i][0];
                int y = cell[1] + dir[i][1];
                if (x < 0 || x >= m || y < 0 || y >= n || dist[x][y] <= dist[cell[0]][cell[1]] + 1)
                    continue;
                queue.offer(new int[] {x, y});
                dist[x][y] = dist[cell[0]][cell[1]] + 1;
            }
        }
        return dist;
    }
}
```

