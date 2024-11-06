package Strings;
import java.util.*;

public class ValidParenthesis {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if( (top == '[' && c == ']') || (top == '{' && c == '}') || (top == '(' && c == ')')){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("(){}[(}]"));
    }
}
