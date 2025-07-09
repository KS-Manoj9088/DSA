package Hashing;
import java.util.*;


public class PrintFrequency {

    static HashMap<String, Integer> hm =new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] words = new String[n];

        for(int i = 0;i < n; i++){
            words[i] = sc.nextLine();
            printFrequency(words[i]);
        }

        sc.close();

    }

    public static void printFrequency(String word){
        hm.put(word, hm.getOrDefault(word, 0)+1);
        System.out.print(hm.get(word)+" ");
    }
}
