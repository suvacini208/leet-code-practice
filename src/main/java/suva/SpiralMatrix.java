package suva;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int matrixLength = matrix.length * matrix[0].length;
        int[] result = new int[matrixLength];

        int index = 0;
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        index = 0;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                result[index] = matrix[top][i];
                index++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                result[index] = matrix[i][right];
                index++;
            }
            right--;
            
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result[index] = matrix[bottom][i];
                    index++;
                }
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result[index] = matrix[i][left];
                    index++;
                }
                left++;
            }
        }
        for(int resultNo : result) {
            System.out.println(resultNo);
        }
    }
    
}
