package LinkedLists;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListExamples {

    public static void main(String[] args) {

        // Creating a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 1. add(E e) - Appends the specified element to the end of the list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList after add: " + linkedList);

        // 2. addFirst(E e) - Inserts the specified element at the beginning of the list
        linkedList.addFirst(5);
        System.out.println("LinkedList after addFirst: " + linkedList);

        // 3. addLast(E e) - Inserts the specified element at the end of the list (same as add in LinkedList)
        linkedList.addLast(40);
        System.out.println("LinkedList after addLast: " + linkedList);

        // 4. remove() - Removes and returns the first element of the list (throws exception if empty)
        try {
            int removedElement = linkedList.remove();
            System.out.println("Removed element using remove: " + removedElement);
        } catch (NoSuchElementException e) {
            System.out.println("LinkedList is empty, cannot remove.");
        }
        System.out.println("LinkedList after remove: " + linkedList);

        // 5. removeFirst() - Removes and returns the first element (similar to remove)
        try {
            int removedFirst = linkedList.removeFirst();
            System.out.println("Removed element using removeFirst: " + removedFirst);
        } catch (NoSuchElementException e) {
            System.out.println("LinkedList is empty, cannot removeFirst.");
        }
        System.out.println("LinkedList after removeFirst: " + linkedList);

        // 6. removeLast() - Removes and returns the last element (throws exception if empty)
        try {
            int removedLast = linkedList.removeLast();
            System.out.println("Removed element using removeLast: " + removedLast);
        } catch (NoSuchElementException e) {
            System.out.println("LinkedList is empty, cannot removeLast.");
        }
        System.out.println("LinkedList after removeLast: " + linkedList);

        // 7. getFirst() - Retrieves, but does not remove, the first element (throws exception if empty)
        try {
            int firstElement = linkedList.getFirst();
            System.out.println("First element using getFirst: " + firstElement);
        } catch (NoSuchElementException e) {
            System.out.println("LinkedList is empty, no element to retrieve.");
        }

        // 8. getLast() - Retrieves, but does not remove, the last element (throws exception if empty)
        try {
            int lastElement = linkedList.getLast();
            System.out.println("Last element using getLast: " + lastElement);
        } catch (NoSuchElementException e) {
            System.out.println("LinkedList is empty, no element to retrieve.");
        }

        // 9. contains(Object o) - Returns true if the list contains the specified element
        System.out.println("Does the list contain 20? " + linkedList.contains(20));

        // 10. size() - Returns the number of elements in the list
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // 11. clear() - Removes all elements from the list
        linkedList.clear();
        System.out.println("LinkedList after clear: " + linkedList);
    }
}

