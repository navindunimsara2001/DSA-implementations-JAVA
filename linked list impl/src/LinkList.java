public class LinkList {
    private Link first; // for first Link
    public LinkList(){
        first = null;
    }

    // check empty
    public boolean isEmpty(){
        // if first is null that means LinkList is null
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
        Link nLink = new Link(data);  // create Link
        nLink.next = first;  // connect previous first Link as next Link
        first = nLink;   // update first link
    }

    // delete first method
    public Link deleteFirst(){
        Link temp = first;  // for return purpose
        first = first.next;  // first Link change to next Link of current first Link
        return temp;
    }
}
