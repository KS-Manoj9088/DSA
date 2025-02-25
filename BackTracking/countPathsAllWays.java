package BackTracking;

public class countPathsAllWays {

    public static void main(String[] args){
        boolean board[][] = {
             {true,true,true},
             {true,true,true},
             {true,true,true}
            };

            printAllPaths("", board, 0, 0);

    }

    public static void printAllPaths(String p, boolean[][] board, int row, int col){

        if(row == board.length-1 && col == board[0].length-1){
            System.out.println(p);
            return;
        }                          //Final Position is reached. 

        if(board[row][col] == false){
            return;
        }

        // Considering this cell in our path.
        board[row][col] = false;

        if(row<board.length-1){
            printAllPaths(p+"D", board, row+1, col);
        }

        if(col<board[0].length-1){
            printAllPaths(p+"R", board, row, col+1);
        }

        if(row>0){
            printAllPaths(p+"U", board, row-1, col);
        }

        if(col>0){
            printAllPaths(p+"L", board, row, col-1);
        }

        //Restoring our cell to previous state because to find other solutions in upcoming recusrion function calls.
        board[row][col] = true;
    }
    
}
