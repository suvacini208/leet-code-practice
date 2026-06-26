package suva;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] numbers = /*{1, 2,2,3};*/ {1, 1, 1};
        boolean isMonotonicIncreasing = true, isMonotonicallyDecreasing = true;
        
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[i-1] ) {
                isMonotonicIncreasing = false;
            }
            if(numbers[i] > numbers[i-1]) {
                isMonotonicallyDecreasing = isMonotonicallyDecreasing & false;
            }
        }
        System.out.print(isMonotonicIncreasing || isMonotonicallyDecreasing);
    }
}