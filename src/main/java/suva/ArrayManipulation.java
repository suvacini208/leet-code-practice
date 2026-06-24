package suva;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] numbers = {4, 0, 1, -2, 3};
        int[] newNumbers = new int[numbers.length];
        int startingNumber = 0, endingNumber = 0;
        for(int i =0; i < numbers.length; i++) {
            if(i != 0) {
                startingNumber = numbers[i-1];
            }
            if(i!=numbers.length-1) {
                endingNumber = numbers[i+1];
            } else {
                endingNumber = 0;
            }
            newNumbers[i] = startingNumber + numbers[i] + endingNumber;
        }
        for(int newNumber : newNumbers) {
            System.out.print(newNumber);
        }
        

    }

}
