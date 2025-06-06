package Strings;


// LC - 3174 
public class ClearDigits {

    public static void main(String[] args){
        String s1 = "123ccc12";
        String res = clearDigits(s1);
        System.out.println(res);
    }


    public static String clearDigits(String s) {
        
        int charIndex = 0;

        StringBuilder sb = new StringBuilder(s);

        while(charIndex < sb.length()){

            if(Character.isDigit(sb.charAt(charIndex))){
                sb.deleteCharAt(charIndex);

                if(charIndex > 0){
                   sb.deleteCharAt(charIndex - 1);
                   charIndex--;
                }
            }
            else{
                charIndex++;
            }
        }
        return sb.toString();
    }
    
}
