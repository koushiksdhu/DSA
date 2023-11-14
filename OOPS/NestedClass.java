// Outside classes can never be static, only inner classes can be static.


public class NestedClass {
    static class A {
        String name;
        public A(String name){
            this.name = name;
        }
        public String toString() {
           return this.name;
    }
    }

    public static void main(String args[]) {
        A a = new A("Koushik");
        A b = new A("Sadhu");

        System.out.println(a);
        System.out.println(b);
    }

    
}
