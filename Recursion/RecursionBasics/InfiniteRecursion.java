package Recursion.RecursionBasics;

public class InfiniteRecursion {
    
    public static void main(String[] args) {
        
        int n = 5;
        function(n);
    }

    public static void function(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //function(n--);                 case of infinite recursion  because "n--" will pass value first and after that it will subtract
        function(--n);
    }
}
