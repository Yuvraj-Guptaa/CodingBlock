package Basics;
import java.util.*;

public class postfix {
    public static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0; 
    }

    public static void infixToPostfix(String eqn) {
        int length = eqn.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < length; i++) {
            char ch = eqn.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                System.out.print(ch); 
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    System.out.print(stack.pop()); 
                }
                stack.pop(); 
            } else { 
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    System.out.print(stack.pop()); 
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); 
        }
    }

    public static void main(String[] args) {
        String infixExpression = "A-B/C*D+E";
        System.out.println();
        infixToPostfix(infixExpression);
    }
}
