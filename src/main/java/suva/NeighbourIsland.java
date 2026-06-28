package suva;

public class NeighbourIsland {

    static void dfs(int[][] matrix, boolean[][] visited, int r, int c) {
        if(r < 0 || r >= matrix.length) return;
        if(c < 0 || c >= matrix[0].length) return;
        if(visited[r][c] == true) return;
        if(matrix[r][c] == 0) return;

        visited[r][c] = true;

        // up, down, right, left
        dfs(matrix, visited, r-1, c);
        dfs(matrix, visited, r+1, c);
        dfs(matrix, visited, r, c+1);
        dfs(matrix, visited, r, c-1);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0}, {1, 0, 0}, {0, 0, 1}};
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int islandCount = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(visited[i][j] != true && matrix[i][j] == 1) {
                    islandCount++;
                    dfs(matrix, visited, i, j);
                } 
            }
        }
        System.out.print(islandCount);
    }
}
