package SortingAlgorithms.CyclicSortPattern;


public class FindDuplicateNumber {
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int res1 = findDuplicate(nums);
        if(res1!=-1){
            System.out.println("Duplicate number is: "+res1);
        }
        else{
            System.out.println("No duplicate number found");
        }
        
        

    }

    public static int findDuplicate(int[] nums) {

        for(int i = 0;i < nums.length;){
            if(nums[i] != i+1){

                int correctIndex = nums[i] - 1;
                if(nums[correctIndex]!=nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
