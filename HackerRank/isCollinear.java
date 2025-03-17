package HackerRank;
import java.util.Scanner;

public class isCollinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double area = Math.abs((double) (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);

        if (area == 0) {
            System.out.println("Collinear Points");
        } else {
            System.out.println("Not collinear");
        }

        sc.close();;
    }
}
