package BinarySearch;

public class nextChar {
    public static void main(String[] args) {
        char[] letter = {'a', 'b', 'c', 'd'};
        char target = 'z';
        char result = nextGreaterLetter(letter, target);
        System.out.println("The next greater element is : "+ result);
    }

    public static char nextGreaterLetter(char[] letter, char target){
        int left = 0;
        int right = letter.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letter[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return letter[ left%letter.length];
    }
    
}
