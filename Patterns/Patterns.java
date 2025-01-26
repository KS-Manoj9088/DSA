package Patterns;
import java.util.Scanner;

public class Patterns{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //pattern1(n);         //Full Square
        //pattern2(n);         // Left Hypotenuse Right Angle Triangle
        //patternNumbers(n);   // TCS-ZOHO Question
        //pattern3(n);         // Reverse Left Straight half Pyramid
        //pattern4(n);         // Left Straight number Half Pyramid
        //patternDiamond(n);   //Half Cut Diamond Pattern
        //pattern6(n);         // Right Straight Left spaced * Pattern
        //pattern7(n);         // Right straight left spaced inverted star pattern
        //pattern8(n);         // Traingle
        //pattern9(n);         // Inverted Traingle
        //pattern10(n);        // Incrementing by '1' triangle (Straight Up)
        //pattern11(n);        // Decrementing by '1' triangle (Inverted One)
        //patternSandGlass(n);  // SandGlass Pattern
        //patternHollowTriangle(n); //StraightUp
        //patternHollowInvertedTriangle(n);
        //patternSquareHollowDiamond(n);
        patternFullDiamond(n);


         sc.close();
    }

    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i= n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternDiamond(int n){

        for(int i = 1;i <= 2*n-1;i++){
            if(i<=n){
                for(int j = 1;j <= i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j = 1;j <= 2*n-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void patternNumbers(int n){
        int k = 1;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    if(j<i){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
    }

    public static void pattern8(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n-1;j++){
                if(j>=n-(i-1) && j<=n+(i-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n-1;j++){
                if(j<=2*n-i && j>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void patternSandGlass(int n){
        for(int i = 1;i<=2*n;i++){
            for(int j = 1;j<=n;j++){
                if(i<=n){
                    if(j<i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    if(j<=2*n-i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void patternHollowTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n-1;j++){
                if(j==n-(i-1) || j == n+(i-1) || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patternHollowInvertedTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n-1;j++){
                if(j==2*n-i || j==i || i == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patternSquareHollowDiamond(int n){
        for(int i = 1;i<=2*n;i++){
            for(int j = 1;j<=2*n;j++){
                if(i<=n){
                    if(j<=n-(i-1) || j>=n+i){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    if(j<=2*n-(i-5) && j>=i-n+1){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void patternFullDiamond(int n){
        for(int i = 1;i<=2*n-1;i++){
            if(i<=n){
                for(int j = 1;j<=2*n-1;j++){
                    if(j<=n+(i-1) && j>=n-(i-1)){
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            else{
                for(int j = 1;j<=2*n-1;j++){
                    if(j>=i-n+1&& j<=3*n-i-1){
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


}
