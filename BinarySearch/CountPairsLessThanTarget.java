package BinarySearch;

import java.util.*;

public class CountPairsLessThanTarget {
    public static void main(String[] args) {
        Integer[] numsArray = {-1, 1, 2, 3, 1}; // Use Integer[] instead of int[]
        List<Integer> nums = new ArrayList<>(Arrays.asList(numsArray)); // Convert properly
        int target = 2;
        int no_of_pairs = countPairs(nums, target);
        System.out.println("Number of pairs: " + no_of_pairs);
    }

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); 
        int count = 0; 
        int left = 0; 
        int right = nums.size() - 1; 
        while (left < right) { 
            if (nums.get(left) + nums.get(right) < target) { 
                count += right - left; 
                left++; 
            } else { 
                right--; 
            }
        }
        return count; 
    }
}