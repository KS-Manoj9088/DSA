/*
 * Linaear Data Structure
 * Elements are arranged in sequential order.
 *  Elements can be accessed by their index.
 * LIFO - last in first out
 */

 /*
  * Push - to insert an element into stck.
  * Pop - to remove an element from stack.
  * Peek - to view the top element of the stack.
  * isEmpty - to check if the stack is empty.
  * size - to get the number of elements in the stack. 
  */

public class StacksUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StacksUsingArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() throws isEmptyStackException {
        if (isEmpty()) {
            throw new isEmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StacksUsingArray stack = new StacksUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();

        try {
            System.out.println("Top element is: " + stack.peek());
        } catch (isEmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();

        stack.push(40);
        stack.push(50);
        stack.push(60); // Will show "Stack is full"
        stack.displayStack();
    }
}



















