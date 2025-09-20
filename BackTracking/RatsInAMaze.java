import java.util.ArrayList;

public class RatsInAMaze {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        boolean[][] grid = new boolean[n][n];
        ArrayList<String> outer = new ArrayList<>();
        helper("", maze, grid,0, 0, outer, n);
        return outer;
    }
    
    public static void helper(String path,int[][] maze,boolean[][] grid,int row, int col, ArrayList<String> outer, int n){
        // BaseCase's
        if(maze[row][col] == 0){
            return;
        }
        
        if(row == n-1 && col == n-1){
            outer.add(path);
            return;
        }
        
        grid[row][col] = true;
        
        if(row < n-1){
            helper(path+"D", maze, grid, row+1, col, outer, n);
        }
        
        if(row > 0){
            helper(path+"U", maze, grid, row-1, col, outer, n);
        }
        
        if(col < n-1){
            helper(path+"R", maze, grid, row, col+1, outer, n);
        }
        
        if(col > 0){
            helper(path+"L", maze, grid, row, col-1, outer, n);
        }
        
        grid[row][col] = false;
    } 
} 
