// LAMBDA FUNCTIONS: Lambda functions are the inline functions.

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // System.out.println(sum(5, 2)+"\n\n");

        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 8));
        // arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subtract = (a, b) -> a - b;
        Operation divide = (a, b) -> a / b;

        System.out.println("\n\nSum: "+operate(5, 7, sum));
        System.out.println("Product: "+operate(5, 7, product));
        System.out.println("Subtract: "+operate(10, 5, subtract));
        System.out.println("Divide: "+operate(10, 5, divide));

    }   
    // static int sum(int a , int b) {             // Normal Function
    //     return a + b;
    // }

    static int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {               // INTERFACE
    int operation(int a, int b);
}
