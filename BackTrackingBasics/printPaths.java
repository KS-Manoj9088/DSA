package BackTrackingBasics;
import java.util.*;

public class printPaths {

    public static void main(String[] args) {
        int[] initialPos = new int[] {3,3};
        ArrayList<String> paths = printpaths("", initialPos[0], initialPos[1]);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    // Steps to return a ArrayList
    // 1. Maintain a local ArrayList
    // 2. on the local list use "addAll" method on left-recursion calls and right-recursion calls
    // 3. return local list.
    // 4. In case of base condition Add result to list and return list.

    public static ArrayList<String> printpaths(String p, int row, int col){
        ArrayList<String> paths = new ArrayList<>();
        if(row == 1 && col == 1){
            paths.add(p);
            return paths;
        }
        if(col>1){
            paths.addAll(printpaths(p + "R", row, col-1));
        }

        if(row>1){
            paths.addAll(printpaths(p + "D", row-1, col));
        }
        return paths;
    }

    /*
     *  public static ArrayList<String> printPaths1(String p, int row, int col) {
        ArrayList<String> paths = new ArrayList<>();

        // Base Case: If row or col reaches 1, construct the remaining path
        if (row == 1 || col == 1) {
            while (row > 1) {
                p += "D";
                row--;
            }
            while (col > 1) {
                p += "R";
                col--;
            }
            paths.add(p);
            return paths;
        }

        paths.addAll(printPaths1(p + "R", row, col - 1));

        // Move Down
        paths.addAll(printPaths1(p + "D", row - 1, col));

        return paths;
    }
    */       
}
