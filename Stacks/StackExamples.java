import java.util.Stack;
import java.util.EmptyStackException;

public class StackExamples {

    public static void main(String[] args) {
        
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // 1. push(E e) - Pushes an item onto the top of the stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push: " + stack);

        // 2. pop() - Removes the object at the top of the stack and returns it.
        try {
            int poppedElement = stack.pop();
            System.out.println("Popped element using pop: " + poppedElement);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty, cannot pop.");
        }
        System.out.println("Stack after pop: " + stack);

        // 3. peek() - Looks at the object at the top of the stack without removing it.
        try {
            int topElement = stack.peek();
            System.out.println("Top element using peek: " + topElement);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty, no element to peek.");
        }

        // 4. isEmpty() - Tests if the stack is empty.
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // 5. search(Object o) - Returns the 1-based position from the top of the stack where the object is located.
        int position = stack.search(20);
        if (position != -1) {
            System.out.println("Position of element 20 from top: " + position);
        } else {
            System.out.println("Element 20 not found in stack.");
        }
        
        // Final stack state
        System.out.println("Final stack: " + stack);
    }
}

