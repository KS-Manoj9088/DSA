package Queues;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class generateBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of numbers required : ");
        int n = sc.nextInt();
        String res[] = genBinaryNumbers(n);
        for (String s : res) {
            System.out.print(s+" ");
        }
        sc.close();
}

    public static String[] genBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0;i < n; i++){
            result[i] = q.poll();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            q.offer(s1);
            q.offer(s2);
        }
        return result;
    }
    
}

/*
Offer method - Inserts the specified element into the queue (returns false if queue is full).
Poll method - Retrieves and removes the head of the queue (returns null if queue is empty).
 */
