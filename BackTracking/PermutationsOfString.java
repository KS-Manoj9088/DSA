import java.util.*;

public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        List<String> allPermutations = new ArrayList<>();
        boolean[] bool_map = new boolean[word.length()];
        
        permutationsOfString(word, bool_map, "", allPermutations);
        System.out.println(allPermutations);
        
        sc.close();
    }
    
    public static void permutationsOfString(String word, boolean[] bool_map, String temp, List<String> result) {
        if (temp.length() == word.length()) {
            result.add(temp);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            if (!bool_map[i]) {
                bool_map[i] = true;
                permutationsOfString(word, bool_map, temp + word.charAt(i), result);
                bool_map[i] = false; // Backtracking step
            }
        }
    }
}