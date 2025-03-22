package Strings.StringBuilderStringBuffer;

import java.util.StringTokenizer; 

// java.util.stringTokenizer pacakge lo untaadhi
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String  s = "Hi,Iam,learning,java,programming";
        StringTokenizer st = new StringTokenizer(s,",");

        System.out.println(st.countTokens());
        System.out.println(st.nextToken());

        System.out.println(st.countTokens());
        System.out.println(st.hasMoreTokens());

        while (st.hasMoreElements() == true){
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
        }
        
    }
    
}
