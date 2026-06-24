package suva;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println("Indices: " + result[0] + ", " + result[1]);
                    break;
                }
            }
        }

        HashMap<Integer, Integer> numComplementMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numComplementMap.containsKey(complement)) {
                result = new int[] {numComplementMap.get(complement), i};
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                numComplementMap.put(nums[i], i);
            }
        }
    }
}