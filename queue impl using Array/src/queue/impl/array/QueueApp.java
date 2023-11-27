package queue.impl.array;

public class QueueApp {
    public static void main(String[] args) {
        // create Queue object
        Queue queue = new Queue(5);

        // insert values to queue
        queue.insert(1);
        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.insert(9);
        queue.insert(11);  // this will generate an error

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove(); // this will generate an error
    }
}
