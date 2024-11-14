/*
 * Linear DataStructure used for storing the data.
 *  This is a simple implementation of a linked list.
 * Its an ordered list in which insertion are done at one end, called as rear and 
 * deletions are done at another end , called as front.
 * The first element inserted is the first one to be deleted.
 * Hence, it is called as First in First Out(FIFO) list.
 */

package Queues;

import java.util.NoSuchElementException;

public class queueimplementation {
    
    private Node front;
    private Node rear;
    private int length;

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public queueimplementation(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    
    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }


    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int dequeue(){          // In dequeue operation  remove the front.
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        else{
            int result = front.data;
            front = front.next;    
            if(front == null){     // only 1 element in queue.
                rear = null;
            }
            length--;
            return result;
        }

    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        queueimplementation queue = new queueimplementation();

        //ENQUEUE
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();

        //DEQUEUE
        queue.dequeue();
        queue.print();
    }
    

}
