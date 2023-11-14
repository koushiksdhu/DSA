

public class example {
    static int a = 5;
    static int b;

    static {
        System.out.println("Static Block");
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println(example.a);
        System.out.println(example.b);
    }
}
