package Strings.CHARACTERS.CHARACTER_BASICS;

public class CharDemo {
    
    public static void main(String[] args) {
        
        int i = 'a'+1;
        System.out.println(i); //98

        char ch = 'a'+1;
        System.out.println(ch); //b

        char ch1 = 65+'0';
        System.out.println(ch1); // internal type casting is happening (char) (65+48) => char(113).  ans is "q".
        
        int j = (int)'0';
        System.out.println(j); //48

        int k = (int)'A';
        System.out.println(k); //65

        char ch2 = 65;
        System.out.println(ch2); //A

        String s1 = "efg";
        char c4 = s1.charAt(0);
        System.out.println(c4); //e

        int digit = s1.charAt(0) - '0';
        System.out.println(digit); //  53
        System.out.println((char)digit);  // (ASCII)53 == 5 


        /*
         * Numbers ascii values strt from => 
         * ASCII(0) => 48
         * ASCII(1) => 49
         * 
         * Capitals ascci values strt from => 
         * ASCII(65) => 'A'
         * ASCII(66) => 'B'
         * 
         * Small Letters ascii values strt from => 
         * ASCII(97) => 'a'
         * ASCII(98) => 'b'
         */
    }
}
