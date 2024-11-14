package LinkedLists;

public class detectCyclesinLL extends SinglyLinkedList{
    public static void main(String[] args) {
        detectCyclesinLL list = new detectCyclesinLL();
        list.createLinkedList();
        System.out.println("Does the linked list have a cycle? " + detectCycle(head));
    }

    public Node createLinkedList(){
        head = new Node(10);           // Head manam singly linkedlist class lo static theskunnam .... so changes should be directly reflected to the singly linked lsit class's head pointer.
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
           // Created a cycle.
        return head;
        }

    public static boolean detectCycle(Node head){
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

}
