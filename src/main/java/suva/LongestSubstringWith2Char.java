package suva;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWith2Char {
    public static void main(String[] args) {
        String s = "ccaabbb";
        Map<Character, Integer> window = new HashMap<>();
        //int left = 0, right = s.length() -1 ;
        int maxSubStringLength = 0;

        /*while(left < right) {
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
        }*/
       int left = 0;
        for(int right = 0; right < s.length(); right++) {
            window.merge(s.charAt(right), 1, Integer::sum);
            while(window.size() > 2) {
                window.merge(s.charAt(left), -1, Integer::sum);
                if(window.get(s.charAt(left)) == 0) {
                    window.remove(s.charAt(left));
                }
                left++;
            }
            maxSubStringLength = Math.max(maxSubStringLength, right - left + 1);
        }
        System.out.print(maxSubStringLength);   
    }
}