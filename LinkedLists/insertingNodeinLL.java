package LinkedLists;

public class insertingNodeinLL extends SinglyLinkedList{
    insertingNodeinLL list1 = new insertingNodeinLL();
    public static void main(String[] args) {
        insertingNodeinLL list1 = new insertingNodeinLL();
        list1.insert(1, 10);
        list1.insert(2, 20);
        list1.insert(3, 30);
        list1.insert(4, 40);
        list1.printList();
    }
}
