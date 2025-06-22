package Conversions;

import java.util.Stack;

public class PreFixToInfix {
    public static void main(String[] args) {
        String prefix = "+-*+ABCDF";
        String infix = prefixToInfix(prefix);
        System.out.println(infix);
    }

public static String prefixToInfix(String s){
        int n = s.length();
        int i = n-1;

        // Our Stack atlast contains the infix expression - 
        // So maintain Stack as a Stack of Strings

        Stack<String> stack = new Stack<>();

        while(i>=0){

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

                String str = '(' + t1 + ch + t2 + ')';
                stack.push(str);
            }
            i--;
        }

        return stack.peek().toString();
    }
}
