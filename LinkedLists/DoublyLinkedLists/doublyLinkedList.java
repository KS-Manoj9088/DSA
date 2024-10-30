package LinkedLists.DoublyLinkedLists;

public class doublyLinkedList{

    public Node head;        //3 instance variables.
    public Node tail;
    public int length;
    
    public class Node{

        public int data;
        public Node next;
        public Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public doublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return this.length == 0; 
    }

    public int length(){
        return this.length;
    }

}