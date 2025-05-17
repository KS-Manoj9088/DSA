package BitManipulation;
import CommonMethods.*;

public class FirstNumberIII{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,4,5,5,6,6};
        int[] res = singleNumber(arr);
        commonMethods.printArray(res);
    }

    public static int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans^=num;
        }
        int a = 0,b = 0;

        // Calculate the 1st set bit
        int bit = ans & (-ans);
        

        // First Set bit '1' unnavi anni oka array lo and '0' unnavi anni oka array lo store avuthai
        // Array lo store cheyyadam kanna (bit&num) chesthae either '0' or '1' vasthai ee method vaadi array usage space ni reduce cheyochu...
        // Follwed by the result perform ExOR on array values ...
        for(int num : nums){
            if((bit&num)==0){
                a^=num;
            }
            else{
                b^=num;
            }
        }

        return new int[]{a,b};
    }
}