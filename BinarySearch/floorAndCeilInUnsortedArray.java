package BinarySearch;


public class floorAndCeilInUnsortedArray {

    public static void main(String[] args) {

        int[] arr = new int[] {9,7,33,65,12,10,34,57};
        int target = 66;
        int[] result = getFloorAndCeil(target, arr);
        System.out.println("Floor of " + target + " is " + result[0]);
        System.out.println("Ceil of " + target + " is " + result[1]);
    }

    public static int[] getFloorAndCeil(int x, int[] arr) {
        arr = insertionSort(arr);
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            
            if(arr[mid]==x){
                return new int[] {arr[mid], arr[mid]};
            }
            else if(x<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        int floor = high<0 ? -1 : arr[high];
        int ceil = low>=arr.length ? -1 : arr[low];
        
        return new int[] {floor, ceil};
    }
    
    public static int[] insertionSort(int[] arr){
        
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j-1]>=arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    
}
