package ElementaryProgramming;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Input two binary numbers
            System.out.println("Enter the first binary number:");
            String binary1 = sc.nextLine();

            System.out.println("Enter the second binary number:");
            String binary2 = sc.nextLine();

            // Add the binary numbers
            String result = addBinary(binary1, binary2);

            // Output the result
            System.out.println("The sum of " + binary1 + " and " + binary2 + " is " + result);
        } finally {
            sc.close();
        }
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();

        int i = binary1.length() - 1; // Pointer for the first binary number
        int j = binary2.length() - 1; // Pointer for the second binary number
        int carry = 0; // Carry over value during addition

        // Iterate from right to left over both binary strings
        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? binary1.charAt(i) - '0' : 0; // Get bit from binary1 or 0 if out of bounds
            int bit2 = (j >= 0) ? binary2.charAt(j) - '0' : 0; // Get bit from binary2 or 0 if out of bounds

            int sum = bit1 + bit2 + carry; // Calculate sum of bits and carry
            result.append(sum % 2); // Append the least significant bit (sum modulo 2)
            carry = sum / 2; // Update carry (sum divided by 2)

            i--; // Move to the next bit in binary1
            j--; // Move to the next bit in binary2
        }

        return result.reverse().toString(); // Reverse the result and return it
    }
}

/*
 * Components Explanation
i >= 0:

This condition checks whether the index i is valid (i.e., greater than or equal to 0).
If i is less than 0, it means we’ve processed all digits of the string binary1.
Ternary Operator (? :):

This is a shorthand for an if-else statement.
Syntax:
css
Copy code
condition ? value_if_true : value_if_false;
Here, if i >= 0 evaluates to true, the value is binary1.charAt(i) - '0'. Otherwise, the value is 0.
binary1.charAt(i):

This retrieves the character at position i in the string binary1.
- '0':

Converts the character (e.g., '1' or '0') into its integer equivalent.
In Java, characters are internally stored as numbers (ASCII values). For example:
'0' has an ASCII value of 48.
'1' has an ASCII value of 49.
Subtracting '0' from a character gives the actual integer value:
'1' - '0' = 49 - 48 = 1
'0' - '0' = 48 - 48 = 0
: 0:

If the index i is out of bounds (i.e., i < 0), the value defaults to 0.
Purpose
This line ensures that:

If the current index i is within the bounds of the string binary1, the corresponding binary digit is retrieved as an integer.
If the index i is out of bounds (negative), it treats the digit as 0 (useful when adding binary numbers of different lengths).
Example
Let’s assume binary1 = "1010" and i = 2:

Condition:

i >= 0: true (since 2 >= 0).
Character Extraction:

binary1.charAt(2) retrieves the character at index 2, which is '1'.
Conversion to Integer:

'1' - '0' = 1.
Final Value:

bit1 = 1.

Now consider i = -1 (index out of bounds):

Condition:

i >= 0: false (since -1 >= 0 is false).
Default Value:

The ternary operator assigns bit1 = 0.

 */