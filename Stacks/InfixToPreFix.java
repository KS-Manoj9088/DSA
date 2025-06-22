public class InfixToPreFix {
    public static void main(String[] args) {
        String infix = "(A+B)*C-D+F";
        String rev_infix = new StringBuilder(infix)
        .reverse()
        .toString()
        .replace('(', '#')  // temp placeholder
        .replace(')', '(')
        .replace('#', ')');

        String prefix = new StringBuilder(InfixToPostFix.infixToPostFix(rev_infix)).reverse().toString();
        System.out.println(prefix);
    }
}
