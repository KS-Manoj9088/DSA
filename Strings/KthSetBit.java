package Strings;
import java.util.*;

public class KthSetBit {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String n1 = Integer.toBinaryString(n);
        boolean res = isSet(n1,k);
        System.out.println(res);

        sc.close();
    }

    public static boolean isSet(String s,int k){
        int length = s.length();

        if (k <= 0 || k > length) {
            return false; 
        }

        if(s.charAt(length-k)=='1'){
            return true;
        }
        return false;
    }
}
