package suva;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        int left = 0, right = t.length();
        Map<Character, Integer> need = new HashMap<>();

        String result = "";

        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0)+1);
        }
        while (left < s.length() - t.length()) {
            System.out.print("Left " + left);
            outer:
            while(right <= s.length()) {
                String tempString = s.substring(left, right);

                // the derived substring meets the need map
                if(isPresent(convertStringToMap(tempString), need)) {
                    // Check its minimal length
                    if(result.length() ==0 || result.length() > tempString.length()) {
                        result = tempString;
                    }
                    break outer;
                } else {
                    right++;
                }
            }
            left++;
            right = t.length() + left;
        }
        System.out.print(result);
    }

    private static boolean isPresent(Map<Character, Integer> inputMap, Map<Character, Integer> need) {
        boolean isPresent = true;
        for(Map.Entry<Character, Integer> mapEntry : need.entrySet()) {
            Character charKey = mapEntry.getKey() ;
            Integer inputCharOccurence = inputMap.get(charKey) ;
            if(inputCharOccurence == null || inputCharOccurence < mapEntry.getValue()) {
                isPresent = false;
            }
        }
        return isPresent;
    }

    private static Map<Character, Integer> convertStringToMap(String t) {
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : t.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }
        return charMap;
    }
}