package LinkedLists;

public class DeletionsLinkedList extends SinglyLinkedList{

    public static void main(String[] args) {


        DeletionsLinkedList dl1 = new DeletionsLinkedList();

        // Creating a linked list to perform operations.
        dl1.insert(1, 10);
        dl1.insert(2, 20);
        dl1.insert(3, 30);
        dl1.insert(4, 40);
        dl1.insert(5, 50);
        dl1.printList();   // 10->20->30->40->50->null

        //Delete at first
        dl1.deleteFirst();
    // to know deleted item
    // sysout(dl1.deleteFirst().data);
        dl1.printList();  // 20->30->40->50->null

        //Delete at last position
        dl1.deleteLast();
        //System.out.println(dl1.deleteLast().data);
        dl1.printList();  // 20->30->40->null


        // Delete at any position
        dl1.deleteAtPosition(2);  //20->40->null
        dl1.deleteAtPosition(1);
        dl1.printList();

    }

    public Node deleteFirst(){
        if(head == null) {
            System.out.println("List is empty. No node to delete");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;      //// Clearing the reference to the next node
        return temp;
    }

    public Node deleteLast(){
        if(head == null) {
            System.out.println("List is empty. No node to delete");
            return null;
        }
        if(head.next == null) {           // // Only one node in the list
            head = null;
            return null;
        }
        Node current = head;
        while(current.next.next != null) {        //// Traverse until the second last node
            current = current.next;
        }
        Node deletedNode  = current.next;        // // Last node to be deleted
        current.next = null;                  // Remove the last node
        return deletedNode;
    }

    public Node deleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty. No node to delete");
            return null;
        }
        if(position == 1){           // To delete first node.
            return deleteFirst();
        }

        Node current = head;        
        int count = 1;
        while(count < position - 1){   //        // Traverse until the node just before the specified position
            current = current.next;
            count++;
        }

                // If the position is invalid (out of bounds)
        if(current == null || current.next == null){
            System.out.println("Position is out of range");
            return null;
        }
        Node deletedNode = current.next;       // The node to be deleted
        current.next = current.next.next;      // Skip to the node after deleted node. 
        return deletedNode;
    } 
}
