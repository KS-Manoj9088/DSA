package Conversions;
import java.util.*;

public class InfixToPostFix {
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)";
        String postfix = infixToPostFix(infix);
        System.out.println(postfix);
    }

    public static String infixToPostFix(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        Stack<Character> stack1 = new Stack<>();
        int len = s.length();

        while (i < len) {
            char ch = s.charAt(i);

            // Add Character or Numeric Digit into our res String.
            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            }
            // Check for opening bracket
            else if (ch == '(') {
                stack1.push(ch);
            }
            // If closing bracket is encountered remove all elements in stack and add to result untill encountering a opening bracket.
            // At last also remove opening bracket from stack.
            else if (ch == ')') {
                while (!stack1.isEmpty() && stack1.peek() != '(') {
                    res.append(stack1.pop());
                }
                stack1.pop();
            }
            else {
                // If incoming operator precedence is lesser than or equal to operator at top of stack,
                // Then remove top of stack until operator at top of stack has precendence greater than incoming operator.

                while ( !stack1.isEmpty() &&
                      ( getPriority(ch) < getPriority(stack1.peek()) ||
                      ( getPriority(ch) == getPriority(stack1.peek()) && ch != '^' ) ) ) {  // Check '^' right associativity
                    res.append(stack1.pop());
                }
                stack1.push(ch);
            }

            i++;
        }

        // After completion of all characters if stack has some characters left in it.
        while (!stack1.isEmpty()) {
            res.append(stack1.pop());
        }

        return res.toString();
    }

    public static int getPriority(char ch) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('^', 3);
        hm.put('*', 2);
        hm.put('/', 2);
        hm.put('+', 1);
        hm.put('-', 1);

        if (hm.containsKey(ch)) {
            return hm.get(ch);
        }

        return -1;
    }
}
