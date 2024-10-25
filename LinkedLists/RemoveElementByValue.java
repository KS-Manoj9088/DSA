package LinkedLists;

public class RemoveElementByValue extends SinglyLinkedList {
    public static void main(String[] args) {
        RemoveElementByValue list1 = new RemoveElementByValue();

        list1.insert(1, 10);
        list1.insert(2, 20);
        list1.insert(3, 30);
        list1.insert(4, 40);
        list1.insert(5, 50);
        list1.printList();

        list1.removeValueFromLinkedList(head, 30);
        System.out.println("After deleting value: ");
        list1.printList();
    }

    public Node removeValueFromLinkedList(Node head, int value) {
        if (head == null) return null;

        // Handle case where the head needs to be removed
        while (head != null && head.data == value) {
            head = head.next; // Move head to next node
        }

        Node prev = null;
        Node current = head;

        // Traverse the list and remove nodes with the specified value
        while (current != null) {
            if (current.data == value) {
                // Node to be deleted
                if (prev != null) {
                    prev.next = current.next; // Bypass the current node
                }
            } else {
                // Only update prev if current is not deleted
                prev = current;
            }
            current = current.next; // Move to the next node
        }
        return head; // Return the updated head
    }

}