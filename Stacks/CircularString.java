package Stacks;

public class CircularString {
    public static void main(String[] args) {
        String sen = "leetcode el";
        boolean b1 = isCircularSentence(sen);
        boolean b2 = isCircularSentence2(sen);
        System.out.println(b1);
        System.out.println(b2);

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


            public static boolean isCircularSentence2(String sentence)
             {
                for (int i = 0; i < sentence.length(); ++i){
                     if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) return false;
                }
                return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
            }
}
