package Strings;
import java.util.*;

public class WordFreqInString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim();
            if (str.isEmpty()) {
                System.out.println("No Words Found");
                continue;
            }

            String[] words = str.split(" ");
            Map<String, Integer> hm = new LinkedHashMap<>();
            int max = 0;
            String maxFreqWord = "";

            for (String word : words) {
                hm.put(word, hm.getOrDefault(word, 0) + 1);
                int count = hm.get(word);
                if (count > max || (count == max && maxFreqWord.isEmpty())) {
                    max = count;
                    maxFreqWord = word;
                }
            }

            System.out.println(maxFreqWord);
        }
        sc.close();
    }
}
