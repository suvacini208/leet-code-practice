package suva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 4, 3};
        //int[] numbers = {3, 3, 3};
        int target = 6;
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int complementingNo = target - numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[j] == complementingNo) {
                    resultMap.put(numbers[i], numbers[j]);
                }
                
            }
        }
        List<List<Integer>> resultList = resultMap.entrySet().stream().map(e -> Arrays.asList(e.getKey(), e.getValue())).collect(Collectors.toList());
        resultList.forEach(list -> list.forEach(number -> System.out.print(number)));


        Set<Integer> seen = new HashSet<>();
        Set<String> usedPair = new HashSet<>();
        List<List<Integer>> newResultList = new ArrayList<>();
        for(int number : numbers) {
            int complimentNo = target - number;
            if(seen.contains(complimentNo)) {
                int minNumber = Math.min(number, complimentNo);
                int maxNumber = Math.max(number, complimentNo);

                String usedPairStr = String.join(",", String.valueOf(minNumber), String.valueOf(maxNumber));
                if(!usedPair.contains(usedPairStr)) {
                    usedPair.add(usedPairStr);
                    newResultList.add(Arrays.asList(minNumber, maxNumber));
                }

            } else {
                seen.add(number);
            }
        }
        newResultList.forEach(list -> list.forEach(number -> System.out.print(number)));
    }
}
