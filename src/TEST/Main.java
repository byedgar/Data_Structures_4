package TEST;

public class Main {
    public static void main(String[] args) {
        System.out.println("Links");
        Link link = new Link("Edgar", 25);
        link.display();

        System.out.println();
        System.out.println("TEST.LinkedList");
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert("Edgars", 25);
        linkedlist.insert("DELETE ME", 100);
        linkedlist.display();
        linkedlist.delete();
        linkedlist.display();
    }
}
