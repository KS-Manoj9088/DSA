package Candelatest;

import java.util.*;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean isValid = validParenthesis(s);
        System.out.println(isValid);

        sc.close();
    }

    public static  boolean validParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                if( (st.peek()=='{' && ch!='}') || (st.peek()=='[' && ch!=']') || (st.peek()=='(' && ch!=')') ){
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty() ? true : false;
    }
}