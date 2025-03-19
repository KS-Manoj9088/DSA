package Strings;

/*
 *3304. Find the K-th Character in String Game I
Solved
Easy
Topics
Companies
Hint
Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation.

 

Example 1:

Input: k = 5

Output: "b"

Explanation:

Initially, word = "a". We need to do the operation three times:

Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".
Example 2:

Input: k = 10

Output: "c" 
 * 
 * 
 * 
 */
public class kThCharacter {

    public static char kthCharacter(int k) {

        String p = "a";
        String res = generateString(p,k);
        System.out.println(res);
        return res.charAt(k-1);
    }

    public static String generateString(String p,int  k){
        if(p.length()>=k){
            return p;
        }
        String s = "";
        for(int i = 0;i < p.length();i++){
            char ch = p.charAt(i);
            s= s + (char)(ch+1);      //type cast carefully.
        }

        return generateString(p+s, k);
    }

    public static void main(String[] args) {
        int n = 5;
        char output = kthCharacter(n);
        System.out.println(output);
    }
    
}
