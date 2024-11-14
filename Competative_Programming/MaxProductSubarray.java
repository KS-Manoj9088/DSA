public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-1,2,21,4,6};
        int max_product = maxProduct(arr);
        System.out.println(max_product);

    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max = Integer.MIN_VALUE;

        for(int i = 0;i < nums.length; i++){
            int prod = 1;
            for(int j = i;j < nums.length; j++){
                prod = prod * nums[j];
                if(prod > max){
                max = prod;
                }
             }
        }

        return max;
    }
}

