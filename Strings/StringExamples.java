package Strings;
public class StringExamples {

    public static void main(String[] args) {

        // Creating a string
        String str = "Hello, World!";
        String str2 = "Hello, Java!";

        // 1. length() - Returns the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(int index) - Returns the character at the specified index
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // 3. substring(int beginIndex) - Returns a substring starting from the specified index
        String substringFrom7 = str.substring(7);
        System.out.println("Substring from index 7: " + substringFrom7);

        // 4. substring(int beginIndex, int endIndex) - Returns a substring from beginIndex to endIndex (exclusive)
        String substringFrom0To5 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substringFrom0To5);

        // 5. contains(CharSequence s) - Checks if the string contains the specified sequence of characters
        boolean containsWorld = str.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);

        // 6. equals(Object obj) - Compares this string to the specified object (case-sensitive)
        boolean isEqual = str.equals(str2);
        System.out.println("Is str equal to str2? " + isEqual);

        // 7. equalsIgnoreCase(String anotherString) - Compares this string to another string, ignoring case
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Is str equal to 'hello, world!' (ignore case)? " + isEqualIgnoreCase);

        // 8. toUpperCase() - Converts all characters in the string to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // 9. toLowerCase() - Converts all characters in the string to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // 10. trim() - Removes leading and trailing whitespace
        String strWithSpaces = "  Hello, World!  ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // 11. replace(char oldChar, char newChar) - Replaces all occurrences of a specified character with a new character
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacing 'o' with 'a': " + replacedStr);

        // 12. replace(CharSequence target, CharSequence replacement) - Replaces each substring that matches a target sequence
        String replacedSubstring = str.replace("World", "Java");
        System.out.println("String after replacing 'World' with 'Java': " + replacedSubstring);

        // 13. split(String regex) - Splits the string around matches of the given regular expression
        String[] splitStr = str.split(", ");
        System.out.println("Splitting string by ', ':");
        for (String part : splitStr) {
            System.out.println(part);
        }

        // 14. startsWith(String prefix) - Checks if the string starts with the specified prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);

        // 15. endsWith(String suffix) - Checks if the string ends with the specified suffix
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Does the string end with '!'? " + endsWithExclamation);

        // 16. indexOf(String str) - Returns the index of the first occurrence of the specified substring
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // 17. lastIndexOf(String str) - Returns the index of the last occurrence of the specified substring
        int lastIndexOfO = str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndexOfO);

        // 18. isEmpty() - Checks if the string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // 19. join(CharSequence delimiter, CharSequence... elements) - Joins multiple strings with a specified delimiter
        String joinedStr = String.join(", ", "Hello", "Java", "World");
        System.out.println("Joined string: " + joinedStr);
    }
}

