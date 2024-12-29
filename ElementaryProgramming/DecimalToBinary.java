package ElementaryProgramming;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = getBinary(decimal);
        System.out.println("Binary representation of " + decimal + " is " + binary);
        sc.close();
    }

    public static String getBinary(int num){
        if(num == 0) return "0";
        int temp = num;
        StringBuilder res = new StringBuilder();
        while(temp!=0){
            int rem = temp%2;
            res.append(Integer.toString(rem));
            temp = temp/2;
        }
        return res.reverse().toString();
    }
    
}
