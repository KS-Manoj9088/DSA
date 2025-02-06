package ElementaryProgramming;
import java.util.*;

public class FactorsOfNumber {

    public static void main(String[] args) {
        int num = 40;
        findFactors(num);
    }

    public static void findFactors(int n){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i <=Math.sqrt((n));i++){
            if(n%i == 0){
                if(n/i == i){
                    list.add(i);
                }        //Incase n = 36 then (36/6 = 6  i.e n/i == i) rendu sarlu result will be added
                else{
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
