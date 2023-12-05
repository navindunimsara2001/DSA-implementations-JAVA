public class Link {
    // Link class attributes are public
    public int iData;  // hold data
    public Link next; // hold next reference

    // constructor
    public Link(int data){
        iData = data;
        next = null;   // immediately Link is floating
    }

    // display method
    public void displayLink(){
        System.out.println(iData);
    }
}
