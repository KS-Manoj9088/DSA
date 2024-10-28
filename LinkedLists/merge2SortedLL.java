package LinkedLists;

public class merge2SortedLL extends SinglyLinkedList{
    public Node head;
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        

        merge2SortedLL list1 = new merge2SortedLL();
        list1.head = new Node(1);
        list1.head.next = new Node(3);
        list1.head.next.next = new Node(5);
        list1.head.next.next.next = new Node(7);
        list1.head.next.next.next.next = new Node(9);
        list1.head.next.next.next.next.next = new Node(11);
        list1.head.next.next.next.next.next.next = new Node(13);
        list1.head.next.next.next.next.next.next.next = new Node(15);
        list1.head.next.next.next.next.next.next.next.next = new Node(17);
        list1.head.next.next.next.next.next.next.next.next.next = new Node(19);
        list1.head.next.next.next.next.next.next.next.next.next.next = new Node(21);
        list1.head.next.next.next.next.next.next.next.next.next.next.next = new Node(23);

        merge2SortedLL list2 = new merge2SortedLL();
        list2.head = new Node(2);
        list2.head.next = new Node(4);
        list2.head.next.next = new Node(6);
        list2.head.next.next.next = new Node(8);
        list2.head.next.next.next.next = new Node(10);
        list2.head.next.next.next.next.next = new Node(12);
        list2.head.next.next.next.next.next.next = new Node(14);
        list2.head.next.next.next.next.next.next.next = new Node(16);
        list2.head.next.next.next.next.next.next.next.next = new Node(18);
        list2.head.next.next.next.next.next.next.next.next.next = new Node(20);
        list2.head.next.next.next.next.next.next.next.next.next.next = new Node(22);
        list2.head.next.next.next.next.next.next.next.next.next.next.next = new Node(24);
        System.out.println("List 1: ");
        list1.printList();
        System.out.println("List 2: ");
        list2.printList();
        System.out.println("Merged Lists: ");
        merge2SortedLL mergedLists = new merge2SortedLL();
        mergedLists.head = mergedLists.merge2SortedLists(list1.head, list2.head);
        mergedLists.printList();

    }

    public Node merge2SortedLists(Node l1, Node l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        Node dummy =new Node(0);
        Node current = dummy;
        while( l1!=null && l2!=null){
            if( l1.data <= l2.data){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}