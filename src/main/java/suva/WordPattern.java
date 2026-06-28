package suva;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        Map<Character, String> patternMap = new HashMap<>();
        String[] strArray = s.split(" ");
        if ( pattern.length() != strArray.length) {
            System.out.print(false);
            return;
        }
        for(int i = 0; i < pattern.length(); i++) {
            Character patternChar = pattern.charAt(i);
            String strValue = strArray[i];
            String mapValue = patternMap.get(patternChar);
            if(mapValue == null) {
                patternMap.put(patternChar, strValue);
            } else if (!strValue.equals(mapValue)) {
                System.out.print(false);
                return;
            }
        }
        Set<String> valueSet = new HashSet<String>(); 
        patternMap.values().forEach(value -> valueSet.add(value));
        if(patternMap.keySet().size() != valueSet.size()) {
                System.out.print(false);
                return;
        }
        System.out.print(true);
    }
}
