package queue.impl.array;

public class Queue {
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int maxSize; // size of the queue array
    private int[] queueArr; // declare array
    private int nItems; // number of items in the queue

    // overloaded constructor
    public Queue(int maxSize){
        this.maxSize = maxSize;  // set array max size
        queueArr = new int[this.maxSize]; // define array
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    // insert method
    public void insert(int value){
        if(rear == maxSize-1){ // check whether queue if full
            System.out.println("Error : Queue is full"); // error message
        }
        else{
            rear++; // increment rear
            queueArr[rear] = value; // insert item
            nItems++; // increment number of items
            System.out.println("Inserted "+value);
        }
    }

    // remove method
    public int remove(){
        if(nItems == 0){ // check whether queue is empty
            System.out.println("Error : Queue is empty"); // error message
            return -1;
        }
        else{
            nItems--; // decrease number of items
            int value =  queueArr[front];
            front++;
            System.out.println("Removed "+value);
            return value;
        }
    }

    // peekFront method
    public int peekFront(){
        if(nItems == 0){ // check whether queue is empty
            System.out.println("Error : Queue is empty"); // error message
            return -1;
        }
        else{
            return queueArr[front];
        }
    }

    // isEmpty method
    public boolean isEmpty(){
        return (nItems==0);
    }

    // isFull method
    public boolean isFull(){
        return (rear == maxSize-1);
    }
}
