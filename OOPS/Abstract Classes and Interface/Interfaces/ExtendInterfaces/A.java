public interface A {
    void fun();

    static void greeting() {
        System.out.println("Hey! I am Static Method.");
    }

    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
// Static interface method should always have a body.
// Nested interface can be public, private or protected but the top level interface has to be declared as public or default.


