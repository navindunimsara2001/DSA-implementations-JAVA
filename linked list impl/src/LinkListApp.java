public class LinkListApp {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        // insert four items
        list.insertFirst(34);
        list.insertFirst(65);
        list.insertFirst(71);
        list.insertFirst(20);
        // display the list
        list.displayList();
        // delete item one by one
        while (list.isEmpty()){
            Link rmLink = list.deleteFirst();
            System.out.println("Deleted ");
            rmLink.displayLink();
        }
    }
}
