package arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        
        // Convert int[] to Integer[] using streams
        Integer[] integerArray = Arrays.stream(intArray)
                                       .boxed()
                                       .toArray(Integer[]::new);
        
        // Print the result
        System.out.println(Arrays.toString(integerArray));
    }
}
