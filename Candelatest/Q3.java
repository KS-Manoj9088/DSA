package Candelatest;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        boolean res = validatePosition(str);

        System.out.println(res);
        sc.close();
    }

    public static boolean validatePosition(String str){
        str = str.toLowerCase();
        int[] initPosi = new int[2];

        int[] res = new int[2];
        for(char ch : str.toCharArray()){
            //int[] directions = hm.get(ch);
            if(ch=='u'){
                res[1]++;
            }

            if(ch=='d'){
                res[1]--;
            }

            if(ch == 'l'){
                res[0]--;
            }

            if(ch == 'r'){
                res[0]++;
            }
        }

        if(res[0] == initPosi[0] && res[1] == initPosi[1]){
            return true;
        }
        return false;
    }
}
