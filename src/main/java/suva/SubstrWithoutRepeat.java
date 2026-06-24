package suva;

import java.util.HashMap;
import java.util.Map;

public class SubstrWithoutRepeat {
    public static void main(String[] args) {
        String s = "bbbb";
        int left = 0;
        Map<Character, Integer> window = new HashMap<>();
        int maxLength = 0;
        for(int right = 0 ; right < s.length(); right++) {
            char c = s.charAt(right);
            window.merge(c, 1, Integer::sum);
            while(window.get(c) > 1) {
                window.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.print(maxLength);
    }
}