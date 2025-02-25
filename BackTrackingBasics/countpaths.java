package BackTrackingBasics;

public class countpaths{
    public static void main(String[] args) {
        int[] initialPos = new int[] {4,4};    //Telling that a 4*4 matrix is given and start position is => {4,4}
        //int[] finalPos = new int[] {1,1};      //Final position of the maze is {1,1}
        int totalPaths = countPaths(initialPos[0],initialPos[1]);
        System.out.println("Total number of paths from start to end is: "+totalPaths);

    }

    public static int countPaths(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int countDown = 0;
        int countRight = 0;
        countDown = countDown + countPaths(row-1,col);
        countRight = countRight + countPaths(row,col-1);
        return countDown + countRight;
    }
}