import java.util.Stack;
public class BackSpaceStringCompare {
    
    public static void main(String[] args) {
        String s1 = "ab#c";
        String s2 = "ad#c";

        BackSpaceStringCompare bs = new BackSpaceStringCompare();
        System.out.println(bs.backspaceCompare(s1, s2)); // true
    }

    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack<>();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (ans.empty()==false)
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
