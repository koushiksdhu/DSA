public class Daughter extends Parent{


    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
   public void career(){
        System.out.println("This is a Daughter class career method");
    }

    @Override
    public void partner() {
        System.out.println("This is a Daughter class partner method");
    }

}
