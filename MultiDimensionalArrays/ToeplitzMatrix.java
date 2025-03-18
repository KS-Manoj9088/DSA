package MultiDimensionalArrays;

public class ToeplitzMatrix{
    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4},
                        {5,1,2,3},
                        {9,5,1,2}
                      };

        System.out.println("Given Matrix is Toeplitx Matrix :"+isToeplitzMatrix(arr));

    }

    public static boolean valid(int[][] matrix,int x,int y){
        int i = x;
        int j = y;

        int row = matrix.length;
        int col = matrix[0].length;

        int temp = matrix[x][y];
        boolean isValid = true;

        while(i<row && j<col){
            if(matrix[i][j]!=temp){
                isValid = false;
                return isValid;
            }
            i++;
            j++;
        }

        return isValid;
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        boolean check = true;

        for(int i = 0; i < col; i++){
            if(valid(matrix, 0, i)==false){
                check = false;
                return check;
            }
        }

        for(int i = 1;i < row;i++){
            if(valid(matrix,i,0)==false){
                check = false;
                return check;
            }
        }

        return check;
    }
}