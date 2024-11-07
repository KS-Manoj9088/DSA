package Stacks;

public class CircularString {
    public static void main(String[] args) {
        String sen = "leetcode";
        isCircularSentence(sen);
         
    }
    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            int lastIndex = words[i].length() - 1;
            int nextIndex = (i + 1) % words.length;   // To check at edge case i.e last element checking with 1st element.
            if (words[i].charAt(lastIndex) != words[nextIndex].charAt(0)) {
                return false;
            }
        }
        return true;
    }

}
