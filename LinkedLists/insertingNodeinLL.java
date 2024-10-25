package LinkedLists;

public class insertingNodeinLL extends SinglyLinkedList{
    public static void main(String[] args) {
        insertingNodeinLL list1 = new insertingNodeinLL();
        list1.insert(1, 10);
        list1.insert(2, 20);
        list1.insert(3, 30);
        list1.insert(4, 40);
        list1.printList();

        head = list1.insertNode(head, 50);
        head = list1.insertNode(head,-10);
        list1.printList();
    }

    public Node insertNode(Node head,int value){
        Node newnode = new Node(value);

        if(head!=null && newnode.data <= head.data){
            newnode.next = head;
            head = newnode;
            return head;          // insertion if new node data is less than head nodes data.
        }

        Node current = head;
        Node prev = null;
        while(current!=null && newnode.data > current.data){
            prev = current;
            current = current.next;
        }
        if(current == null){           
            prev.next = newnode;         //Inserting at last node
        }
        else{
            newnode.next = current;      // Insert in middle of linkedlist.
            prev.next = newnode;
        }
        return head;
    }
}
