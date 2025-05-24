import java.util.ArrayList;
import java.util.List;

public class PermutationsOfIntArray{
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        PermutationsOfIntArray p1 = new PermutationsOfIntArray();
        List<List<Integer>> allPermutations = p1.permute(arr);
        System.out.println(allPermutations);
    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        boolean[] bool_map = new boolean[nums.length];
        findPermutations(nums, bool_map, new ArrayList<>(), outer);
        return outer;
    }

    public void findPermutations(int[] arr,boolean[] bool_map,ArrayList<Integer> res,List<List<Integer>> outer)  
    {
        if(res.size() == arr.length){
            outer.add(new ArrayList<>(res));
        }

        for(int i = 0;i < arr.length; i++){
            if(bool_map[i] == false){
                res.add(arr[i]);
                bool_map[i] = true;
                findPermutations(arr, bool_map, res, outer);
                // BackTracking Condition....
                res.remove(res.size() - 1);
                bool_map[i] = false;
            }
        }
    } 
}