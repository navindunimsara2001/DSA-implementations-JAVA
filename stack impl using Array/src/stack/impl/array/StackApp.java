package stack.impl.array;

public class StackApp {
    public static void main(String[] args) {
        // create Stack object
        Stack stack = new Stack(5);
        // insert values to stack
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12); // this will generate an error

        // remove value from stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // this will generate an error
    }
}