package Arrays;
import BinarySearch.binarySearch;
public class Dummy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        binarySearch bs = new binarySearch();
        int res_index = bs.binarySearching(arr,5);
        System.out.println(res_index);
    }
}
