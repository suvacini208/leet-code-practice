package suva;

public class ChangingKeys {

    public static void main(String[] args) {
        String s = "aAbBcC";
        int shiftCount = 0;
        char prevChar = Character.toLowerCase(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            char currChar = Character.toLowerCase(s.charAt(i));
            if(prevChar != currChar) {
                shiftCount++;
            }
            prevChar = currChar;
        }
        System.out.print(shiftCount);
    }
    
}
