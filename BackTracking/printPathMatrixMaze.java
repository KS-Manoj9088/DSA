
import java.util.*;

public class printPathMatrixMaze {


    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
        int[][] arr = new int[board.length][board[0].length];
        printPathMatrix("",board,0,0,arr,1);
        
             }
        
        public static void printPathMatrix(String p,boolean[][] board,int row,int col,int maze[][],int step){

        if(row==board.length-1 && col==board[0].length-1){
            maze[row][col] = step;
            for(int[] arr : maze){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(board[row][col] == false){
            return;
        }


        //BackTracking Initialisation Step

        board[row][col] = false;
        maze[row][col] = step;

        if(row<board.length-1){
            printPathMatrix(p+"D",board,row+1,col,maze,step+1);
        }
        if(col<board[0].length-1){
            printPathMatrix(p+"R",board,row,col+1,maze,step+1);
        }
        if(row>0){
            printPathMatrix(p+"U", board, row-1, col, maze, step+1);
        }
        if(col>0){
            printPathMatrix(p+"L", board, row, col-1, maze, step+1);
        }

        //Actual BackTracking Resetting Step to Originak States
        board[row][col] = true;
        maze[row][col] = 0;
    
     }
    
}
