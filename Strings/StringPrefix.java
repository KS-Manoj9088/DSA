package Strings;

public class StringPrefix {

    public static void main(String[] args){
        String s = "Hello Bhai";
        System.out.println(s.substring(0, 5)); // prints "Hello"
        int index = isPrefixOfWord(s, "Worl");
        System.out.println(index);

    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int wordIndex = 0;
    
        for (String word : words) {
            wordIndex++;
            // Check if searchWord is a prefix of the current word
            if (word.startsWith(searchWord)) {
                return wordIndex;
            }
        }
        return -1;
    }
    
    
}
