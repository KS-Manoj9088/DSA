package Queues;

public class queueImplementationUsingArray {
    private int front, rear, size;
    private int[] queue;

    // Constructor to initialize the queue with a specified capacity
    public queueImplementationUsingArray(int capacity) {
        this.size = capacity;
        this.front = this.rear = -1;
        this.queue = new int[capacity];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Enqueue method to add elements to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (isEmpty()) {
            front = 0;  // Set front to 0 if adding the first element
        }
        queue[++rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue method to remove elements from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;  // Returning -1 to indicate an error
        }
        int removedValue = queue[front];
        // Shift front to the next element
        if (front == rear) {
            front = rear = -1;  // Reset to empty state if it was the last element
        } else {
            front++;
        }
        System.out.println("Dequeued: " + removedValue);
        return removedValue;
    }

    // Method to print the queue elements
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        queueImplementationUsingArray queue = new queueImplementationUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);  // Should indicate that the queue is full
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
    }
}
