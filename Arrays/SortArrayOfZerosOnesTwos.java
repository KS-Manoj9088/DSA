package Arrays;

public class SortArrayOfZerosOnesTwos {
    public static void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;

        // Count occurrences of 0, 1, and 2
        for (int num : nums) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }

        // Overwrite original array based on counts
        int index = 0;
        for (int i = 0; i < c0; i++) nums[index++] = 0;
        for (int i = 0; i < c1; i++) nums[index++] = 1;
        for (int i = 0; i < c2; i++) nums[index++] = 2;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,2,2,2,0,0,0,0,1,1,1,1,1,2,2,2};
        sortColors(nums);
        System.out.println(nums.toString());
    }
}
