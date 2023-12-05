public class LinkList {
    private Link first;
    public LinkList(){
        first = null;
    }

    // check empty
    public boolean isEmpty(){
        return (first == null);
    }

    // display list
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
    // insert first method
    public void insertFirst(int data){
        Link nLink = new Link(data);
        nLink.next = first;  // connect previous first Link as next Link
        first = nLink;   // update first link
    }
}
