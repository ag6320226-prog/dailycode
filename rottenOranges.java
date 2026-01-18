public class rottenOranges {
    private boolean isSafe(int i, int j, int n, int m) {
        return 0 <= i && i < n && 0 <= j && j < m;
    }

    public int orangesRot(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean changed;

        int elapsedTime = 0;

        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (true) {
            changed = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == elapsedTime + 2) {
                        for (int[] dir : directions) {
                            int x = i + dir[0];
                            int y = j + dir[1];
                            if (isSafe(x, y, n, m) && mat[x][y] == 1) {
                                mat[x][y] = mat[i][j] + 1;
                                changed = true;
                            }
                        }
                    }
                }
            }
            
            if (!changed) {
                break;
            }
            elapsedTime++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    return -1;
                }
            }
        }

        return elapsedTime;
    }

    public static void main(String[] args) {
        int[][] mat = {{2, 1, 0, 2, 1}, {1, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
      rottenOranges sol = new rottenOranges();
        System.out.println(sol.orangesRot(mat));
    }
}
