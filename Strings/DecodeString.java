package Strings;
import java.util.*;

public class DecodeString {
    
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        String key1 = "eljuxhpwnyrdgtqkviszcfmabo", message1 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        String decodedMessage1 = decodeString(key, message);
        System.out.println(decodedMessage1);

        String decodeMessage2 = decodeString(key1, message1);
        System.out.println(decodeMessage2);

    }

    public static String decodeString(String key, String message){

        HashMap<Character, Character> hm = new HashMap<>();

         int ascii = 97;

        for(char ch : key.toCharArray()){
            if((ch!=' ')&&!hm.containsKey(ch)){
                hm.put(ch, (char)(ascii++));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : message.toCharArray()){
            sb.append(ch==' '? ' ' : hm.get(ch));
        }

        return sb.toString();
    }
}
