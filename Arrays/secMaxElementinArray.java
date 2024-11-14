package Arrays;

public class secMaxElementinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,78,77};
        int second_largest_Number = findSecondMax(arr);
        System.out.println(second_largest_Number);
    }
    
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
}
