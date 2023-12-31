package stack.impl.list;

public class Stack {
    private Node topNode;

    class Node{
        int value;
        Node next; // this will hold previously entered Node reference
    }

    // constructor
    public Stack(){
        topNode = null;
    }

    // push method : add value
    public void push(int value){
        // create new node temp
        Node temp = new Node();
        // assign values to temp object
        temp.value = value;
        // assign next Node reference to temp
        temp.next = topNode;   // assign next Node to previous topNode reference
        // update topNode reference
        topNode = temp;    // assign current topNode to new temp Node reference
        System.out.println("Inserted "+value);
    }

    // pop method : remove top value
    public int pop(){
        if(topNode == null) { // check whether stack is empty
            System.out.println("Error : Stack is empty");
            return -1;
        }
        else{
            int value = topNode.value;
            topNode = topNode.next;  // again topNode reference set to previously inserted node
            System.out.println("Deleted : "+value);
            return value;
        }
    }

    // peek method : return top value
    public int peek(){
        if(topNode == null){ // check whether stack is empty
            System.out.println("Error : Stack is empty");
            return -1;
        }
        else{
            return topNode.value;
        }
    }
}
