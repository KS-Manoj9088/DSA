import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2};

        SubsetSum s1 = new SubsetSum();
        List<Integer> res_list = s1.subsetSums(arr);
        System.out.println(res_list);
    }

    public List<Integer> subsetSums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        functionHelper(0, nums, 0, hs);
        return new ArrayList<>(hs);
    }


    public void functionHelper(int index, int[] nums, int sum, HashSet<Integer> hs) {
        if (index == nums.length) {
            hs.add(sum); // Fix: Add sum directly instead of new HashSet<>(sum)
            return;
        }

        // Include current number in the sum
        functionHelper(index + 1, nums, sum + nums[index], hs);
        
        // Exclude current number from the sum
        functionHelper(index + 1, nums, sum, hs);
    }

}
