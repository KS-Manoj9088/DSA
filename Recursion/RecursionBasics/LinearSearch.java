package Recursion.RecursionBasics;
import java.util.*;

public class LinearSearch {

    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) {
        int[] arr = {90,88,90,77,77,62,77};

        int key = 77;

        if(linearSearch(arr,key,0)){
            System.out.println("The "+key+" is found at index : "+findIndex(arr, key, 0)+" .");
        }
        else{
            System.out.println("The "+key+" is not found in the array");
        }

        System.out.print("-------------------------");

        if(linearSearch(arr,key,0)){
            System.out.println("\nThe "+key+" is found at index : "+findIndexLast(arr, key, arr.length-1)+" .");
        }
        else{
            System.out.println("The "+key+" is not found in the array");
        }

        System.out.print("-------------------------");

        findAllOccurences(arr, key, 0);
        System.out.println("\n"+list);
    }

    public static boolean linearSearch(int[] arr,int key,int index){
        if(index == arr.length){
            return false;
        }

        if(arr[index] == key){
            return true;
        }

        return linearSearch(arr, key, index+1);
    } 

    public static int findIndex(int[] arr,int key,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        return findIndex(arr, key, index+1);
    }

    public static int findIndexLast(int[] arr,int key,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        return findIndexLast(arr, key, index-1);
    }

    public static ArrayList<Integer> findAllOccurences(int[] arr,int key,int index){
        if(index == arr.length){
            return new ArrayList<>();
        }
        if(arr[index] == key){
            list.add(index);
        }
        return findAllOccurences(arr, key, index+1);
    }
}


// Inference enti antae function return type "void " untae recursion chesthunnapudu "return function(......)" ani raayanakkarledhu
// We can simply make the recursion call.