public class StacksUsingLinkedList {
    
    private Node top;
    private int length;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public StacksUsingLinkedList(){
        this.top = null;
        this.length = 0;
    }

    public static void main(String[] args) throws Exception{
        StacksUsingLinkedList stacks = new StacksUsingLinkedList();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        stacks.push(50);    // 10->20->30->40->50 

        stacks.disPlayStack();

        System.out.println("Top element of Stack :- " +stacks.peek()); //50 = top of stack
        System.out.println("Size of Stack :- " +stacks.length());      //5
        System.out.println("Is Stack Empty :- " +stacks.isEmpty());    // false
        System.out.println("Popped element from Stack :- " +stacks.pop());
        System.out.println("Top element of Stack :- " +stacks.peek());          // Top of stack changes after pop operation.


    }

    public int length(){
        return this.length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public int pop() throws Exception{
        int result = 0;
        if(isEmpty()){
            throw new Exception("Stack is empty.");
        }
        else{
            result = top.data;
            top = top.next;
            length--;
        }
        return result;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return top.data;
    }

    public void disPlayStack() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


}
