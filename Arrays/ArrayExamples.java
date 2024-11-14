package Arrays;
import java.util.ArrayList;

public class ArrayExamples {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. add(E e) - Appends the specified element to the end of the list
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList after add: " + arrayList);

        // 2. add(int index, E element) - Inserts the specified element at the specified position in the list
        arrayList.add(1, 15);
        System.out.println("ArrayList after adding 15 at index 1: " + arrayList);

        // 3. get(int index) - Returns the element at the specified position in the list
        int elementAtIndex2 = arrayList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // 4. set(int index, E element) - Replaces the element at the specified position with the specified element
        arrayList.set(2, 25);
        System.out.println("ArrayList after setting 25 at index 2: " + arrayList);

        // 5. remove(int index) - Removes the element at the specified position in the list
        int removedElement = arrayList.remove(1);
        System.out.println("Removed element from index 1: " + removedElement);
        System.out.println("ArrayList after remove: " + arrayList);

        // 6. remove(Object o) - Removes the first occurrence of the specified element from the list
        boolean isRemoved = arrayList.remove(Integer.valueOf(30));
        System.out.println("Is element 30 removed? " + isRemoved);
        System.out.println("ArrayList after removing 30: " + arrayList);

        // 7. size() - Returns the number of elements in the list
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // 8. isEmpty() - Returns true if the list contains no elements
        System.out.println("Is the ArrayList empty? " + arrayList.isEmpty());

        // 9. contains(Object o) - Returns true if the list contains the specified element
        System.out.println("Does the list contain 25? " + arrayList.contains(25));

        // 10. clear() - Removes all elements from the list
        arrayList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("Is the ArrayList empty after clear? " + arrayList.isEmpty());
    }
}
