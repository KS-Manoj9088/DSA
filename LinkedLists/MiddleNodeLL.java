package LinkedLists;

public class MiddleNodeLL extends SinglyLinkedList{

    public static void main(String[] args) {
        MiddleNodeLL list = new MiddleNodeLL();
        list.insert(1, 10);
        list.insert(2, 20);
        list.insert(3, 30);
        //list.insert(4, 40);
        list.insert(5, 50);
        list.insert(6, 60);
        list.insert(7, 70);
        System.out.println("Original List: ");
        list.printList();

        Node middle = list.findMiddle(head);
        System.out.println("Middle Node: " + middle.data);


    }    

    public Node findMiddle(Node head){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    

    
}

