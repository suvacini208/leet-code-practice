package suva;

import java.util.HashSet;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100}, arr2 = {1000};
        int maxCommonPrefix = 0;
        var prefixSet = new HashSet<>();
        
        for(int num: arr1) {
            String numStr = String.valueOf(num);
            for(int i = 0; i < numStr.length(); i++) {
                prefixSet.add(numStr.substring(0, i+1));
            } 
        }

        for(int num: arr2) {
            String numStr = String.valueOf(num);
            for(int i = 0; i < numStr.length(); i++) {
                if(prefixSet.contains(numStr.substring(0, 1 + i))) {
                    maxCommonPrefix = Math.max(maxCommonPrefix, i+1);
                }
            } 
        }

        System.out.print(maxCommonPrefix);
    }
    
}
