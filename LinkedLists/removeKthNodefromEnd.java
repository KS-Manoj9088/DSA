package LinkedLists;


public class removeKthNodefromEnd extends SinglyLinkedList{
    public static void main(String[] args) {
        removeKthNodefromEnd list = new removeKthNodefromEnd();
        list.insert(1, 10);
        list.insert(2, 20);
        list.insert(3, 30);
        list.insert(4, 40);
        list.insert(5, 50);
        list.printList();

        // Removing  kth node from end of linkedlist

        list.removeNodeFromEnd(head, 5);
        list.printList();
    }

    public Node removeNodeFromEnd(Node head, int n) {
        int length = getLength(head);

        if(n == length){
            return head.next;
        }

        Node prev = null;
        Node current = head;
        int count = 1;
        while( count < length-n+1){
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
        return head;    
    }

    public static int getLength(Node head){
        Node temp = head;
        int count = 0;
        while( temp!= null){
            temp = temp.next;
            count++;
        }
        return count;
    }



}