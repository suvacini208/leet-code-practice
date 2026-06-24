package suva;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        String input = "aababccc";
        Map<Character, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char charValue = input.charAt(i);
            resultMap.put(charValue, resultMap.getOrDefault(charValue, 0)+1);
        }

        int maxFrequency = 0;
        for(int frequency : resultMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        char result = 'z' + 1;
        for(Character charKey : resultMap.keySet()) {
            if(resultMap.get(charKey) == maxFrequency) {
                if(charKey < result) {
                    result = charKey;
                }
            }
        }
        System.out.print(result);

    }
}
