import java.util.*;

// Vector is Synchronized. (Synchronized means only one thread can access it at a time.)
// ArrayList can be accessed by a multiple threads that is not synchronized.


public class Main {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();     // Array List
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println(list);

        List<Integer> linkedList = new LinkedList<>();      // Linked List
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);

        System.out.println(linkedList);
    }    
}
