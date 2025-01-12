package Arrays;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(a));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum+=mat[i][i];
            sum+=mat[n-i-1][i];
        }
        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
    
}
