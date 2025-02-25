package BackTrackingBasics;

public class pathWithRestrictions {

    public static void main(String[] args) {
        boolean[][] board = { {true,true,true},
                              {true,false,true},
                              {true,true,true}};

        pathRestrictions("",board,0,0);
    }

    public static void pathRestrictions(String p,boolean[][] maze,int row,int col){

        if(maze[row][col] == false){
            return;
        }

        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(row<maze.length-1){
            pathRestrictions(p+"D",maze,row+1,col);
        }
        
        if(col<maze[0].length-1){
            pathRestrictions(p+"R",maze,row,col+1);
        }
    }
    
}
