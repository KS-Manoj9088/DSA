import java.util.Stack;

public class MaximumNestedDepthOfStack {
    public static void main(String[] args) {
        String str1 = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str1)); // Output: 3

        String str2 = "()(())((()()))";
        System.out.println(maxDepth(str2)); // Output: 3
    }

    public static int maxDepth(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        int maxDepth = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push('(');
                count++;
            }
            else if(ch==')'&& st.isEmpty()==false && st.peek()=='('){
                maxDepth = Math.max(maxDepth, count);
                count--;
                st.pop();
            }
            else{
                continue;
            }
        }
        return maxDepth;
    }
}


// Logic enti antae - Opening bracket appear aithae increase count and decrease when a closing bracket appears.
// If a closing bracket appears and stack is empty, it means there is no matching opening bracket,
// so we ignore. Have a variable to hold maximum of count while traversing over characters of char array of string.
