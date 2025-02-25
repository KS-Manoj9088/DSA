public class NQueens {

    public static void main(String[] args) {
        boolean[][] chess = new boolean[4][4];
        int ways = solveNQueens(chess,0);
        System.out.println("The No of Ways to Keep N-Queens : "+ways);
    }

    public static int solveNQueens(boolean[][] board,int row){

        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }


        int count = 0;
        //Placing everyQueen and Checking every row and column
        for(int col = 0; col<board.length; col++){
            //place the queen if it is safe

            if(isSafe(board,row,col)){
                board[row][col] = true;        // To change states for BackTracking.
                count+=solveNQueens(board, row+1);
                board[row][col] = false;        // To change states for BackTracking. Original BackTracking Condition.
            }
    
        }
        return count;
    }


    public static boolean isSafe(boolean[][] board,int row, int col){

        //check vertical row
        for(int i = 0;i < row;i++){
            if(board[i][col]==true){
                return false;
            }
        }

        //Diagonal Left
        int maxLeft = Math.min(row,col);
        for(int i = 1;i <= maxLeft;i++){
            if(board[row-i][col-i]==true){
                return false;
            }
        }

        //Diagonal Right
        int maxRight = Math.min(row,board.length-col-1);
        for(int i = 1;i <= maxRight;i++){
            if(board[row-i][col+i]==true){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean val : row){
                if(val == true){     // Queen is Placed means True Condition.
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    
}
