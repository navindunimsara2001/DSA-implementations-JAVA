package stack.impl.list;

public class StackApp {
    public static void main(String[] args) {
        // create Stack object
        Stack stack = new Stack();
        // insert values to stack
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        // delete value from stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();  // this will generate an error
    }
}
