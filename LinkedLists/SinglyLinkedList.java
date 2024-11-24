package LinkedLists;

public class SinglyLinkedList {

    public static Node head;

    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        
        SinglyLinkedList list1 = new SinglyLinkedList();

        // Insert at beginning

        list1.insertFirst(88);
        list1.insertFirst(90);
        list1.insertFirst(100);
        list1.printList();

        //Insert at end

        list1.insertEnd(81);
        list1.insertEnd(82);
        list1.insertEnd(83);
        list1.printList();

        //Insert at any position

        list1.insert(1, 15);
        list1.insert(2, 25);
        list1.insert(5,35);
        list1.printList();

        // Searching element

        boolean isFound = list1.findElement(15);
        System.out.println("Value found : "+isFound);
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void countNoOfNodes(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        System.out.println(count);
    }

    public void insertAtBeginning(Node newNode,Node head){  //way-1
        newNode.next = head;
        head = newNode;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value){
        Node newNode = new Node(value);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node current = head;
            int count = 1;
            while(count < position - 1 && current.next != null){
                current = current.next;
                count++;
            }
            if(current.next == null){
                current.next = newNode;
            }
            else{
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public boolean findElement(int value){
        Node current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }

        return false;
    }


    
}
