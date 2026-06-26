package suva;
public class AdjacentElementWithSame {
    public static void main(String[] args) {
        int[][] queries = {{0,2}, {1,2}, {3,1}, {1,1}, {2,1}};
        int n = 4;
        int[] colors = new int[n];
        int[] results = new int[queries.length];
        for(int i = 0; i< n; i++) {
            colors[i] = 0;
        }

        int countAdjacentColors = 0;
        for(int j = 0; j < queries.length; j++) {
            int[] query = queries[j];
            int colourIndex = query[0];
            if(colourIndex > 0 && colors[colourIndex] == colors [colourIndex-1] && colors[colourIndex] != 0) {
                countAdjacentColors--;
            }
                if(colourIndex < colors.length - 1  && colors[colourIndex] == colors [colourIndex+1] && colors[colourIndex] != 0) {
                countAdjacentColors--;
            }
            colors[colourIndex] = query[1];
            
            if(colourIndex > 0 && colors[colourIndex] == colors[colourIndex-1] && colors[colourIndex] != 0) {
                countAdjacentColors++;
            }
            if(colourIndex < colors.length - 1 && colors[colourIndex] == colors [colourIndex+1] && colors[colourIndex] != 0) {
                countAdjacentColors++;
            }
            results[j] = countAdjacentColors;
        }

        System.out.println("Result");
        for(int result: results) {
            System.out.print(result);
        }
    }
}