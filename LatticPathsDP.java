public class LatticPathsDP {
    private static long countLatticePathsDP(int m, int n) {
        long[][] grid = new long[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++){
            //System.out.println("i = " + i);
            grid[i][0] = 1;
        }
        for (int j = 0; j < n + 1; j++){
            //System.out.println("i = " + i);
            grid[0][j] = 1;
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                //System.out.println("i = " + i + " j = " + j);
                //System.out.println("grid i = " + grid[i - 1][j] + " j = " + grid[i][j - 1] + " and sum = " +  grid[i][j]);

            }
        }
        return grid[m][n];
    }

    public static void main(String[] args) {
        // System.out.println("Hello World");
        long result = countLatticePathsDP(20, 20);
        System.out.println(result);
        // int result = countLatticePathDP2();
        // System.out.println(result);

    }
}