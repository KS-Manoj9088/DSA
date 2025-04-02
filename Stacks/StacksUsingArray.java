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
      private int maxSize; // Maximum size of the stack
      private int[] stackArray; // Array to hold the stack elements
      private int top; // Index of the top element in the stack
  
      // Constructor to initialize the stack
      public StacksUsingArray(int size) {
          this.maxSize = size;
          this.stackArray = new int[maxSize];
          this.top = -1; // Stack is initially empty
      }
  
      // Method to add an element to the stack
      public void push(int value) {
          if (isFull()) {
              System.out.println("Stack is full. Cannot push " + value);
              return;
          }
          stackArray[++top] = value; // Increment top and add the value
          System.out.println("Pushed " + value + " to the stack.");
      }
  
      // Method to remove and return the top element of the stack
      public int pop() {
          if (isEmpty()) {
              System.out.println("Stack is empty. Cannot pop.");
              return -1; // Return -1 to indicate stack is empty
          }
          return stackArray[top--]; // Return the top value and decrement top
      }
  
      // Method to return the top element without removing it
      public int peek() {
          if (isEmpty()) {
              System.out.println("Stack is empty. Cannot peek.");
              return -1; // Return -1 to indicate stack is empty
          }
          return stackArray[top]; // Return the top value
      }
  
      // Method to check if the stack is empty
      public boolean isEmpty() {
          return top == -1; // True if top is -1
      }
  
      // Method to check if the stack is full
      public boolean isFull() {
          return top == maxSize - 1; // True if top is at the last index
      }
  
      // Method to display the elements of the stack
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
  
      // Main method for testing the stack implementation
      public static void main(String[] args) {
          StacksUsingArray stack = new StacksUsingArray(5); // Create a stack of size 5
          stack.push(10);
          stack.push(20);
          stack.push(30);
          stack.displayStack(); // Display stack elements
  
          System.out.println("Top element is: " + stack.peek()); // Peek at the top element
  
          System.out.println("Popped element: " + stack.pop()); // Pop the top element
          stack.displayStack(); // Display stack elements after popping
  
          stack.push(40);
          stack.push(50);
          stack.push(60); // This will show "Stack is full" message
          stack.displayStack(); // Display stack elements
      }
  }



















