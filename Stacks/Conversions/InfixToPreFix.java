package Conversions;
import java.util.HashMap;
import java.util.Stack;

public class InfixToPreFix {
    public static void main(String[] args) {
        String infix = "(A^B)^C-D+F";
        String rev_infix = new StringBuilder(infix)
        .reverse()
        .toString()
        .replace('(', '#')  // temp placeholder
        .replace(')', '(')
        .replace('#', ')');

        String prefix = infixToPreFix(rev_infix);
        System.out.println(prefix);
    }

    public static String infixToPreFix(String s){
        String res = "";
        int  i = 0;
        Stack<Character> stack1 = new Stack<>();
        int n = s.length();

        while(i < n){
            char ch = s.charAt(i);
            // Handle if charaacter is operand
            if(Character.isLetterOrDigit(ch)){
                res = res+ch;
            }
            // Handle Opening Bracket
            else if(ch=='('){
                stack1.push(ch);
            }
            // Handle Closing Bracket
            else if(ch==')'){
                while(!stack1.isEmpty() && stack1.peek()!='('){   // To pop all other operators after the opening bracket
                    res = res+stack1.pop();
                }
                stack1.pop();  // To pop opening bracket
            }
            else{
                if(ch=='^'){ // We cannot store 2 '^' operators in stack simultaneously.
                    while(!stack1.isEmpty() && getPriority(ch)<=getPriority(stack1.peek())){
                        res = res+stack1.pop();
                    }
                }
                else{
                    while(!stack1.isEmpty() && getPriority(ch) < getPriority(stack1.peek())){
                        res = res + stack1.pop();
                    }
                }

                stack1.push(ch);
            }
            i++;
        }

        while(!stack1.isEmpty()){
            res = res+stack1.pop();
        }

        return new StringBuilder(res).reverse().toString();
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
