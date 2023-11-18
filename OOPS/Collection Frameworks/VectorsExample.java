import java.util.*;

// Vector is Synchronized i.e., only one thread can access it at a time.
// Vector is not as fast as ArrayList.

public class VectorsExample {
    public static void main(String args[]) {

        List<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(15);
        vector.add(20);
        vector.add(25);

        System.out.println(vector);
    }    
}
