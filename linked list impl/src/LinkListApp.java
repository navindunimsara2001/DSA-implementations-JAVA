public class LinkListApp {
    public static void main(String[] args) {
        Link l1 = new Link(25);
        Link l2 = new Link(10);
        Link l3 = new Link(70);

        l1.next = l2;
        l2.next = l3;
    }
}
