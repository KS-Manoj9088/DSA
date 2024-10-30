package LinkedLists.DoublyLinkedLists;
import java.util.NoSuchElementException;

import LinkedLists.SinglyLinkedList;

public class doublyLinkedList extends SinglyLinkedList{

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

    public void displayForward(){     // Traverse linkedlist in forward direction
        if(head == null){
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void displayBackward(){           // Traverse linked list backward.
        if(tail == null){
            return;
        }
        
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAtLast(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    public Node deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node current = head;
        if(head == tail){  // If only one node in the list.
            tail = null;    
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
        current.next = null;
        return current;
    }

    public Node deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node current = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        current.prev = null;
        return current;
    }


    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();

        //Insert at beginning.
        dll.insertAtFirst(10);
        dll.insertAtFirst(20);
        dll.insertAtFirst(30);
        dll.displayForward(); // Output: 30->20->10->Null

        //Insert at last.
        dll.insertAtLast(40);
        dll.insertAtLast(50);
        dll.displayForward(); // Output: 30->20->10->40->50->Null

        dll.insertAtFirst(60);
        dll.displayForward(); // Output: 60->30->20->10->40->50->Null


        // Delete at first
        dll.deleteFirst();
        dll.displayForward(); // Output: 30->20->10->40->50->Null

        // Delete at last
        dll.deleteLast();
        dll.displayForward(); // Output: 30->20->10->40->Null

    }
}