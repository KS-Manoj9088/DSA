//package BackTracking;
import java.util.ArrayList;

public class SubsetsOfArray {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr ={3,1,2};
        SubsetsOfArray s1 = new SubsetsOfArray();
        s1.generateSubsets(0,arr, new ArrayList<>());
        System.out.println("All Subsets : "+s1.list);
    }

    public void generateSubsets(int index,int[] arr,ArrayList<Integer> res){
        if(index>=arr.length){
            list.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[index]);
        generateSubsets(index+1, arr, res);
        res.remove(res.size()-1);
        generateSubsets(index+1, arr, res);
    }
}
