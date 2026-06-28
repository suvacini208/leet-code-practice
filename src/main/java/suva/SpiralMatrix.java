package suva;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] results = new int[matrix.length * matrix[0].length];
        int top = 0, left = 0;
        int bottom = matrix.length - 1, right = matrix[0].length - 1;
        int index = 0;
        while(left<=right && top<=bottom) {
            for(int i = left; i <= right; i++) {
                results[index] = matrix[top][i];
                index++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                results[index] = matrix[i][right];
                index++;
            }
            right--;

            if(left<=right) {
                for(int i = right; i >= left; i--) {
                    results[index] = matrix[bottom][i];
                    index++;
                }
                bottom--;
            }

            if(top<=bottom) {
                for(int i = bottom; i >= top; i--) {
                    results[index] = matrix[i][left];
                    index++;
                }
                left++;
            }
        }
        for(int result : results) {
            System.out.println(result);
        }
    }
    
}
