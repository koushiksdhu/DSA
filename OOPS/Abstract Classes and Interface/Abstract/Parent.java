// We can't have final abstract class becuase final prevents the class from being inherited whereas abstract must be inherited and its abstract methods must be overriden in some other concrete class.
// class cannot extend multiple classes.
public abstract class Parent {

    String name;
    int age;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // abstract Parent(String name, int age);  ----> We cannot create abstract constructor.

    // We also cannot create abstract static methods, because we know that static methods never gets overriden.
    // Abstract methods need to be overriden whereas static methods are never overriden. So, not possible to create abstract static methods.
    // But we can create static methods in abstract classes.

    static void hello() {
        System.out.println("Hello, from static methods");
    }

    void normal() {
        System.out.println("This is a normal method.");
    }

    public abstract void career();      // Abstract method do not specify a body.
    public abstract void partner();
}
