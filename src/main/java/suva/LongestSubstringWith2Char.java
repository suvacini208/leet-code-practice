package suva;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWith2Char {
    public static void main(String[] args) {
        String s = "ccaabbb";
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = s.length() -1 ;
        int maxSubStringLength = 0;

        while(left < right) {
            inner:
            for(int i = left; i < right; i++) {
                window.merge(s.charAt(i), 1, Integer::sum);
                // window failure condition, slide
                if(window.size() > 2) {
                    left++;
                    maxSubStringLength = Math.max(maxSubStringLength, right - left);
                    break inner;
                }
            }
        }
        System.out.print(maxSubStringLength);   
    }
}