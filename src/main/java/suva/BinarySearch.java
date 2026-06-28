package suva;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 7, 9, 11, 13};
        int left = 0, right = number.length - 1;
        int mid = (right - left) / 2;
        int target = 13;

        while (left <= right) {
            if(number[mid] == target) {
                System.out.print("Found");
                return;
            } else if(number[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        System.out.print("Not Found");
        
    }
}
