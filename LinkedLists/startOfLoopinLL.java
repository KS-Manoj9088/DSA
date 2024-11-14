package LinkedLists;

public class startOfLoopinLL extends detectCyclesinLL{
    public static void main(String[] args) {
        startOfLoopinLL list = new startOfLoopinLL();
        list.createLinkedList();
        System.out.println("Does the linked list has loop :- " +detectCycle(head));
        System.out.println("I need to return start of loop in linked list :- ");
        System.out.println("Start of loop is :- " +findStartofLoop(head).data);
    }

    public static Node  findStartofLoop(Node head){
        Node slowptr = head;
        Node fastptr = head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr){
                return getStartNode(slowptr);
            }
        }
        return null;    // If the linked list doesnot containa any loops.
    }

    public static Node getStartNode(Node slowptr){
        Node current = head;
        while(current!=slowptr){
            current = current.next;
            slowptr = slowptr.next;
        }
        return slowptr;
    }
    
}
