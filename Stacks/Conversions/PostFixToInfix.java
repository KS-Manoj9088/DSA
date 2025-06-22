package Conversions;
import java.util.*;

public class PostFixToInfix {
    public static void main(String[] args) {
        String postFix = "AB-DE+f*/";
        String infix = postfixToInfix(postFix);
        System.out.println(infix);
    }

    public static String postfixToInfix(String s){
        int i = 0;
        int n = s.length();

        // Our Stack atlast contains the infix expression - 
        // So maintain Stack as a Stack of Strings

        Stack<String> stack = new Stack<>();

        while(i<n){

            char ch = s.charAt(i);

            // if operand encountered add to stack
            if(Character.isLetterOrDigit(ch)){
                stack.push(Character.toString(ch));
            }
            // if a operator is encountered
            // make a string = '(' + t1 + operator + t2 + ')' 
            // add that string to stack
            else{
                String t1 = stack.pop();
                String t2 = stack.pop();

                String str = '(' + t2 + ch + t1 + ')';
                stack.push(str);
            }
            i++;
        }

        return stack.peek().toString();
    }

}
