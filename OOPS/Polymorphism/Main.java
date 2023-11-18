public class Main {
    public static void main(String args[]) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        // Number n1 = new Number();
        // n1.one();
        // System.out.println(n1.one(5));
        // System.out.println(n1.one(5, 7));


    }    

}

class Number {
    int n1, n2;
    void one() {
        System.out.println("Method of void type");
    }
    int one(int n1) {
        this.n1 = n1;
        return this.n1;
    }

    double one(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        return this.n1 + this.n2;
    }
}

// Method Overloading: When multiple method in a class is having the same method name but with different parameter list or different return type then it is called Method Overloading.
// Method Oveloading is decided at compile time and hence it is also known as compile time polymorphism or static polymorphism.
// Compile time polymorphism is achieved using Method overloading.



/*  There are two types of polymorphism:
        -> Compile time polymorphism or Static Polymorphism - achieved by Method Overloading, also known as Early Binding.
        -> Runtime Polymorphism or Dynamic Polymorphism - achieved by Method Overriding, also known as Late Binding.

-> We can use final keyword in methods to prevent overriding. We cannot override a method which is declared as a final.
-> We can use final keyword in class to prevent it from inheritance. Final class cannot be inherited by the another class but Final class can extend another non-final class.
-> Static method cannot be overrided. So, if the static methods are overriden then only the Parent class static method is always called.
*/