public interface B {

    default void defaultMethod() {
        System.out.println("This is the default method in an interface");
    }

    void greet();
}

// For  inheritance between interfaces,  we use  extend keywords.
// Annotation i.e. @Override is also an INTERFACE.