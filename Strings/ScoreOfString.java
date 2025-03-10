package Strings;

public class ScoreOfString {
    
    public static int scoreOfString(String s) {
        int res = 0;
        for(int i = 0;i < s.length()-1;i++){
            res+=Math.abs(s.codePointAt(i)-s.codePointAt(i+1));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello")); // 13
    }
}
