package SortingAlgorithms.CyclicSortPattern;

public class FirstMissingPositiveNumber {
    
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4};
        int[] arr1 = new int[] {-2,-1,0,1,3,4,5};
        System.out.println("First Missing Postive Number is : "+firstMissingPositive(arr)); // Output: 5
        System.out.println("First Missing Postive Number is : "+firstMissingPositive(arr1)); //
        
    }

    public static int firstMissingPositive(int[] nums) {
        for(int i = 0;i < nums.length;){
                int correctIndex = nums[i] - 1;
                if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correctIndex]){
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }
                else{
                    i++;
                }
        }
    
        for(int i = 0;i < nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        
         return nums.length+1;    // 
        }
}
