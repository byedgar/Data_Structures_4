import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        testSimpleLinkedList();
        testTwoSideLinkedList();
        testIterator();
    }

    private static void testSimpleLinkedList() {
        System.out.println("testSimpleLinkedList START");
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
        }

        System.out.println("Size = " + linkedList.size());

        System.out.println(linkedList);

        linkedList.remove();
        linkedList.remove(3);

        System.out.println(linkedList);

        // for (Object value : linkedList) {
        //     System.out.println(value);
        // }
        System.out.println("testSimpleLinkedList END");
        System.out.println();
    }


    private static void testTwoSideLinkedList() {
        System.out.println("testTwoSideLinkedList START");
        TwoSideLinkedList linkedList = new TwoSideLinkedListImpl();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(4);
        linkedList.addLast(6);

        System.out.println("Size = " + linkedList.getSize());

        linkedList.display();

        linkedList.remove(); // Remove from start
        linkedList.remove(6);

        linkedList.display();
        System.out.println("testTwoSideLinkedList END");
        System.out.println();
    }

    private static void testIterator() {
        System.out.println("testIterator START");
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 3; i++) {
            linkedList.addFirst(i);
        }
        Collection<Integer> collection = linkedList;
        Iterator<Integer> iterator = collection.iterator();
        for (Integer o : collection) {
           // System.out.println(o);
        }
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }


        System.out.println("testIterator END");
        System.out.println();
    }
}
