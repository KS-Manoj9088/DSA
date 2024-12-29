package ElementaryProgramming;

/*
 * 
 * A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
 */

public class AutoMorphicNumber {
    public static void main(String[] args) {
        int[] arr = {25, 49, 76, 36};
        for (int num : arr) {
            if (isAutoMorphic(num)) {
                System.out.println(num + " is an AutoMorphic Number");
            } else {
                System.out.println(num + " is not an AutoMorphic Number");
            }
        }
    }

    public static boolean isAutoMorphic(int num) {
        int square = num * num;

        // Compare the last digits of num and square
        while (num > 0) {
            if (num % 10 != square % 10) {
                return false;
            }
            num /= 10;
            square /= 10;
        }

        return true;
    }
}
