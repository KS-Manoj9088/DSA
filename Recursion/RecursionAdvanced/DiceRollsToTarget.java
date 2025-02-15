package Recursion.RecursionAdvanced;
import java.util.*;


public class DiceRollsToTarget {
    
    public static void main(String[] args){
        int target = 4;
        //diceRolls("",target);
        /*
         *ArrayList<String> result = diceRolls1("", target);
        for(String res : result){
            System.out.println(res);
        }
         */

         diceFace("", target, 3);
    }

    static void diceRolls(String p,int target){    //For 6 face standard dice.
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i <=6 && i <= target;i++){
            diceRolls(p+" "+i, target-i);
        }
    }

    static ArrayList<String> diceRolls1(String p,int target){
        if(target == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i =1; i<=6 && i<=target;i++){
            list.addAll(diceRolls1(p+" "+i, target-i));
        }
        return list;
    }


    static void diceFace(String p,int target,int face){    //For 6 face standard dice.
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i <=face && i <= target;i++){
            diceFace(p+" "+i, target-i, face);
        }
    }
}


//ArrayList returning Pattern

/*
 * 1. BASE CONDITION ArrayList create cheyyali, result ni add cheyyali and finally return that list.
 * 2. General list okati unchukovali bayata.
 * 3. bayata list ki list.addAll(Recursive call cheyyali, p ni add cheyyali, target ni reduce cheyyali).
 * 4. finally return list;
 */
