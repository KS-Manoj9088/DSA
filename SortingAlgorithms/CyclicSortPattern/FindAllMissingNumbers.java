package SortingAlgorithms.CyclicSortPattern;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers{
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingNumbers = findDisappearedNumbers(arr);
        System.out.println("Missing Numbers :- "+missingNumbers);
    }

     public static List<Integer> findDisappearedNumbers(int[] arr) {
        // Range exclusively from 1 to N
        // So correctIndex = arr[i]-1

        List<Integer> l1= new ArrayList<>();

        for(int i = 0;i < arr.length;){
            int correctIndex = arr[i]-1;

            if(arr[i]>=0 && arr[correctIndex]!=arr[i] && arr[i]<=arr.length){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }

        }

        for(int i = 0;i < arr.length;i++){
            if(arr[i]!=i+1){     // Sort chesaka 1 anae number index 0 lo untaadhi ... so ith index lo value and i+1 ni compare chestham.
                l1.add(i+1);
            }
        }
       return l1;
    }
    
}
