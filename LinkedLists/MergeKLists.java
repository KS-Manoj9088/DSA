package LinkedLists;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKLists extends SinglyLinkedList{

    public static void main(String[] args) {
        MergeKLists list1 = new MergeKLists();
        list1.insert(1, 10);
        list1.insert(2, 20);
        list1.insert(3, 30);

        MergeKLists list2 = new MergeKLists();
        list2.insert(4, 40);
        list2.insert(5, 50);
        list2.insert(6, 60);

        MergeKLists list3 = new MergeKLists();
        list3.insert(7, 70);
        list3.insert(8, 80);
        list3.insert(9, 90);

        
    }

    public static Node mergeKLists(Node[] lists) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(Node head : lists){
            Node temp = head;
            while(temp!=null){
                l1.add(temp.data);
                temp=temp.next;
            }
        }
        Collections.sort(l1);
        Node dummy = new Node(0);
        Node current = dummy;
        for(int i = 0;i < l1.size();i++){
            Node newNode = new Node(l1.get(i));
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;
    }

    
}
