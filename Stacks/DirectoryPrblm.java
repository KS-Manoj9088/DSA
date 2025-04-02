import java.util.Stack;

public class DirectoryPrblm{
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(String log : logs){
            if(log.equals("../")){
                if(st.isEmpty()){
                    continue;
                }
                else{
                    st.pop();
                }
            }
            else if(log.equals("./")){
                continue;
            }
            else{
                st.push(log);
            }
        }

        return st.size();
    }
}