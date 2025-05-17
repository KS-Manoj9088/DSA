package BinarySearch;

public class ContainerWithMaxWater{
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int res = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        while(low < high){
            int area = (high-low)*Math.min(height[low], height[high]);
            res = Math.max(res, area);

            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }

        return res;
    }
}