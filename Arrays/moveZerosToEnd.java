// Given an array of Integers, write a function to move all 0's to end of it while maintaining the relative order of the non-zero elements.
// 2-pointer approach.......
// Ekkada "j" pointer unna index lo zero-value(0) undi and "i" pointer unna index
// lo non-zero value untae swap chestham. lekapothae ledhu.
// "j" pointer index non-zero aithae we will increment by j++;

// logic - "i" pointer index > "j" pointer index ayyi mana for loop lo if condition satisfy aithae we swap..

package Arrays;
import CommonMethods.*;

public class moveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {0,8,1,0,2,1,0,3};
        commonMethods.printArray(arr);
        moveZerosToEnd mv = new moveZerosToEnd();
        mv.moveZeros(arr,arr.length);
        commonMethods.printArray(arr);
    }

    public void moveZeros(int[] arr, int n){
        int j = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] != 0 && arr[j] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j]!=0){
                j++;
            }
        }
    }
    
}
