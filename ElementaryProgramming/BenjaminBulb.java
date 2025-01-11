package ElementaryProgramming;
import java.util.Scanner;

public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=Math.sqrt(n);i++){
            System.out.println(i*i);
        }
        scanner.close();
    }
}
