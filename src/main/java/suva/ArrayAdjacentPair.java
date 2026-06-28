package suva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/description/
public class ArrayAdjacentPair {
    public static void main(String[] args) {
        int[][] adjacentPair = {{2,1}, {3,4}, {3,2}};
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        int[] result = new int[adjacentPair.length+1];

        for(int[] singlePair : adjacentPair) {
            graph.computeIfAbsent(singlePair[0], k -> new ArrayList<Integer>()).add(singlePair[1]);
            graph.computeIfAbsent(singlePair[1], k -> new ArrayList<Integer>()).add(singlePair[0]);
        } 

        Integer startKey = null;
        for(Map.Entry<Integer, List<Integer>> mapEntry : graph.entrySet()) {
            if(mapEntry.getValue().size() == 1) {
                startKey = mapEntry.getKey();
            }
        }

        result[0] = startKey;
        result[1] = graph.get(startKey).get(0);
        for(int i = 2; i < result.length; i++) {
            List<Integer> connectedList = graph.get(result[i-1]);
            for(int num : connectedList) {
                if(num != result[i-2]) {
                    result[i] = num;
                }
            }
        }

        for (int num : result) {
            System.out.print(num);
        }
    }
}