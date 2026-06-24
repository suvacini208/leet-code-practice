package suva;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if( c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if( stack.isEmpty()) {
                    System.out.println("Invalid parentheses");
                    return;
                }
                char charexpectedChar = stack.pop();
                if(c == ')' && charexpectedChar != '(' 
                || c == '}' && charexpectedChar != '{' 
                || c == ']' && charexpectedChar != '[') {
                    System.out.println("Invalid parentheses");
                    return;
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("Invalid parentheses");
        } else {
            System.out.println("Valid parentheses");
        }
    }
}