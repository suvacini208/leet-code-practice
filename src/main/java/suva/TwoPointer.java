package suva;

public class TwoPointer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8};
        int target = 10;
        int left = 0, right = numbers.length-1;
        int[] result = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers [right];
            if(target == sum) {
                result[0] = left;
                result[1] = right;
                System.out.println(left);
                System.out.println(right);
                return;
            } else if (sum < target) {
                left++;
                //System.out.println("left:" + left);
            } else {
                right--;
                //System.out.println("right:" + right);
            }
        }
        System.out.println("-1");
        System.out.print("-1");
    }
}
