package Queues;
import java.util.Queue;
import java.util.LinkedList;
//import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class QueueExamples {

    public static void main(String[] args) {
        
        // Example of creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        
        // Or with ArrayDeque
        // Queue<Integer> queue = new ArrayDeque<>();

        // 1. add(E e) - Inserts the specified element into the queue (throws exception if queue is full).
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add: " + queue);

        // 2. offer(E e) - Inserts the specified element into the queue (returns false if queue is full).
        queue.offer(40);
        System.out.println("Queue after offer: " + queue);

        // 3. remove() - Retrieves and removes the head of the queue (throws exception if queue is empty).
        try {
            int removedElement = queue.remove();
            System.out.println("Removed element using remove: " + removedElement);
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty, cannot remove.");
        }
        System.out.println("Queue after remove: " + queue);

        // 4. poll() - Retrieves and removes the head of the queue (returns null if queue is empty).
        Integer polledElement = queue.poll();
        System.out.println("Polled element using poll: " + polledElement);
        System.out.println("Queue after poll: " + queue);

        // 5. element() - Retrieves, but does not remove, the head of the queue (throws exception if queue is empty).
        try {
            int headElement = queue.element();
            System.out.println("Head element using element: " + headElement);
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty, no element to retrieve.");
        }

        // 6. peek() - Retrieves, but does not remove, the head of the queue (returns null if queue is empty).
        Integer peekedElement = queue.peek();
        System.out.println("Peeked element using peek: " + peekedElement);
        
        // Final queue state
        System.out.println("Final queue: " + queue);
    }
}

