package Arrays;

public class resize {
    
    public void resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
    }
}
