package suva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String[] inputStr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> resultMap = new LinkedHashMap<>();

        for(String input: inputStr) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            String sortedStr  = new String(chars);
            resultMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(input);
        }
        resultMap.values().forEach(list -> {
            for(String str : list) {
                System.out.println(str);
            }
        });
    }
}
