package LinkedLists;

public class removeDuplicatesFromSortedLinkedList extends SinglyLinkedList{
    public static void main(String[] args) {
        removeDuplicatesFromSortedLinkedList list = new removeDuplicatesFromSortedLinkedList();
        list.insert(1, 10);
        list.insert(2,10);
        list.insert(3, 20);
        list.insert(4, 20);
        list.insert(5, 30);
        list.insert(6, 30);
        list.printList();

        list.removeDuplicateNodes(head);
        list.printList();

    }

    public Node removeDuplicateNodes(Node head){

        Node current = head;
        while( current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;       // when current node's data and its next nodes data are same , then we will break the link between both the nodes.
            }
            else{
                current = current.next;  // if match is not found then general current pointer increment.
            }
        }

        return head;
    }
    
}
