package LinkedLists;
import CommonMethods.*;

public class SortLinkedLists extends SinglyLinkedList{
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insert(1,90 );
        s1.insert(2, 80);
        s1.insert(3, 60);
        s1.insert(4, 70);
        s1.insert(5, 50);
        s1.insert(6, 30);
        s1.insert(7, 40);
        s1.insert(8, 10);
        s1.insert(9, 20);
        s1.printList();

        System.out.println("Sorting the linked list");

        SortLinkedLists s2 = new SortLinkedLists();
        Node sortedHead = s2.sortList(s1.head);
        s2.head = sortedHead;
        s2.printList();    
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        
        Node mid = getMiddle(head);
        Node rightHalf = mid.next;
        mid.next = null; // Break the list into two halves

        Node left = sortList(head);
        Node right = sortList(rightHalf);

        return merge(left, right);
    }

    private Node getMiddle(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node l1, Node l2) {
        Node dummy = new Node(0), tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}

