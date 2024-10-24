class Node{
    public int data; // holds the data inside the object
    Node next;// pointer that will point to the next object in our list

    Node(int val){
        this.data = val;
        this.next = null;
    }

}

public class LinkedListStack {
    private Node top;

    //the following is the default constructor that will just make an empty linked list
    public LinkedListStack(){
        this.top = null;
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        else
            return false;
    }
    public void push(int val) {
        if(isEmpty()){
            this.top = new Node(val);
        }
        else{
            Node temp = new Node(val);
            temp.next = top;
            top = temp;
        }
    }

    public boolean pop(){
        if(!isEmpty()){
          top = top.next;//this eliminates the first element and turns the second element into the first
            return true;
        }
        else
            System.out.println("There are no elements to delete in the Stack");

        return false;
    }

    public int peek(){
        if(!isEmpty()){
           return top.data;
        }
        else
            System.out.println("There are no elements in the Stack, return is 0");
            return 0;
    }

}
