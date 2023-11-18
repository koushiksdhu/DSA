public class Obj {
    public static void main(String args[]) {
        Son son = new Son("Koushik Sadhu", 22);
        son.career();
        son.partner();
        son.normal();
        System.out.println(son.name);
        System.out.println(son.age);

        Daughter daughter = new Daughter("Soubhik Sadhu", 20);
        daughter.career();
        daughter.partner();
        daughter.normal();
        System.out.println(daughter.name);
        System.out.println(daughter.age);

        Parent.hello();     // Static methods in Parent class.

        // Parent p = new Parent("Sadhu", 10); --> We cannot create an object of Abstract class, it must be extended to a concrete class in order to be used.
    }    
}
