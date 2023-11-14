public class Main {
    public static void main(String args[]) {
        Human h1 = new Human(21, "Koushik Sadhu", 2_00_000, false);
        System.out.println(h1.name);
        System.out.println(Human.population);
        Human h2 = new Human(21, "Animesh Aman", 1_00_000, false);
        System.out.println(h2.name);
        System.out.println(Human.population);
    }    
}
