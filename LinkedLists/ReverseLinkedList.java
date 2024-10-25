package LinkedLists;

public class ReverseLinkedList extends SinglyLinkedList{

    public static void main(String[] args) {
        ReverseLinkedList originalList = new ReverseLinkedList();
        originalList.insert(1, 10);
        originalList.insert(2, 20);
        originalList.insert(3, 30);
        originalList.insert(4, 40);
        originalList.insert(5, 50);
        originalList.insert(6, 60);
        System.out.println("Original List: ");
        originalList.printList();

        // Reversing the list
        Node reversedList = originalList.reversedLinkedList(head);
        SinglyLinkedList.head = reversedList;
        System.out.println("Reversed List: ");
        originalList.printList();
        

    }

    public Node reversedLinkedList(Node head)
    {
        if(head == null){
            return head;
        }
        Node next = null;
        Node prev = null;
        Node current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    return prev;      // ReversedList yokka head ne return chesthunnam.
    }

}


