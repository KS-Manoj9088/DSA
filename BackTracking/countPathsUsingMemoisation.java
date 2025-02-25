
import java.util.*;

public class countPathsUsingMemoisation {

    static HashMap<String, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        
        int totalPaths = countPaths(4,4);
        System.out.println("Total number of paths: " + totalPaths);

        System.out.println("------------------");

        for(String key : memo.keySet()){
            System.out.println(key + " : " + memo.get(key));
        }
    }

    public static int countPaths(int row,int col){
        if(row==1 || col==1){
            return 1;
        }

        String key = row+","+col;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int totalPaths = countPaths(row-1,col)  + countPaths(row, col-1);

        memo.put(key,totalPaths);
        return totalPaths;
    }
    
}
