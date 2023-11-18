public class Son extends Parent {
    
    Son(String name, int age) {
        super(name, age);
    }

    @Override
    public void career() {
        System.out.println("This is a son class career method.");
    }

        
    @Override
    public void partner() {
        System.out.println("This is a son class partner method.");
    }
}
