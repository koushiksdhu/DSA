import java.util.*;

public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        Human koushik = new Human("Koushik Sadhu", 21);

        Human koushikCopy = new Human(koushik);

        System.out.println(koushik.name);
        System.out.println(koushik.age);
        System.out.println(koushikCopy.name);
        System.out.println(koushikCopy.age);
        System.out.println(Arrays.toString(koushik.arr));

        System.out.println();

        koushik.name = "Name Changed";
        koushik.age = 100;

        System.out.println(koushik.name);
        System.out.println(koushik.age);
        System.out.println(Arrays.toString(koushik.arr));
        System.out.println(koushikCopy.name);
        System.out.println(koushikCopy.age);
        System.out.println(Arrays.toString(koushikCopy.arr));



        // We can do the above task by using object cloning() method to make an exact copy of the existing object.
        // clone() is a method in the object class, that is usually used to make copy of the objects.
        // In java.lang package we have an interface called cloneable, must implement that bu the class which clone we want to create.

        System.out.println();
        Human twin = (Human)koushik.clone();        // CLone will copy the value from one object to another object.
        System.out.println(twin.name);
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        
        System.out.println();
        System.out.println(twin.name);
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(koushik.arr));       // On changing twin arr[], koushik arr[] is also changing. This is called shallow copy.
        // In shallow copy, for primitives it is creating a new copy but for objects like Array or String it is referring to the array object of twin.
        // It's not the pure copy of the objects thats why it is called shallow copy.

        // Deep Copy: Create the copy of the object, dont just refer to the memory address of that particular object.
        System.out.println(Arrays.toString(twin.arr));
    }    
}
