package Queues;

public class CircularQueue {
    private int front, rear, size, capacity;
    private int[] queue;

    // Constructor to initialize the queue with a specified capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = -1;
        this.queue = new int[capacity];
        this.size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue method to add elements to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (isEmpty()) {
            front = 0; // Set front to 0 if adding the first element
        }

        // end = (end+1)%size; // When end is out of bounds and there exists a space in queue to add values..
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue method to remove elements from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedValue = queue[front];

        // front = (front+1)%size; // when front is out of bounds
        front = (front + 1) % capacity;
        size--;

        // if(front == end) { point front = rear = -1 } // queue is empty condition
        if (size == 0) {
            front = rear = -1;
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
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // Should wrap around and fill the queue
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(70); // Should reuse freed space
        queue.printQueue();
    }
}