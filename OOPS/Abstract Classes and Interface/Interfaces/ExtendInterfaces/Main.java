public class Main implements A {

    @Override
    public void fun() {
       System.out.println("This is the void method");
    }

    // @Override
    // public void greet() {
    //     System.out.println("This is the greet method"); 
    // }

    public static void main(String args[]) {
        A.greeting();       // Static method inside an interface.

        B obj = new B();
        System.out.println(obj.isOdd(5)); 
        System.out.println(obj.isOdd(10)); 
    }
}
