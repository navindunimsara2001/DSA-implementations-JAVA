public class Stack {
    int[] stackArr;
    int maxSize;
    int top;

    // overloaded constructor
    public Stack(int size){
        this.maxSize = size;
        this.top = -1;
        stackArr = new int[maxSize];
    }

    // push method
    public void push(int value){
        if(top == maxSize -1){ // check whether stack is full
            System.out.println("Error : Stack is full");
        }
        else{
            top++;
            stackArr[top] = value;
            System.out.println("Inserted "+value);
        }
    }

    // pop method

    public int pop(){
        int value = stackArr[top];
        top--;

        return value;
    }
}