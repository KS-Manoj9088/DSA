package BackTracking;

import java.util.ArrayList;

public class printPathsIncludingDiagonals {
    public static void main(String[] args) {
        int[] initialPos = new int[] {3,3};
        ArrayList<String> paths = printpaths("", initialPos[0], initialPos[1]);
        for (String path : paths) {
            System.out.println(path);
        }

        System.out.println(paths);
    }


    public static ArrayList<String> printpaths(String p, int row, int col){
        ArrayList<String> paths = new ArrayList<>();
        if(row == 1 && col == 1){
            paths.add(p);
            return paths;
        }

        // For Diagonal Movement
        if(row>1 && col>1){
            paths.addAll(printpaths(p + "C", row-1, col-1));
        }

        // For Column Movement
        if(col>1){
            paths.addAll(printpaths(p + "R", row, col-1));
        }


        // For Row Movement
        if(row>1){
            paths.addAll(printpaths(p + "D", row-1, col));
        }
        return paths;
    }
}
