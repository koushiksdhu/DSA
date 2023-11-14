// It is a class from which only a single object will be created.


class Singleton {
    String name;
    int roll;
    private static Singleton instance;

    private Singleton(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

     public static Singleton initialize() {
        if(instance == null)
            instance =  new Singleton("Koushik", 27);
        return instance;
    }

    public String toString() {
        return "Name: "+this.name+"\nRoll: "+this.roll+"\n"; 
    }
}

public class singletonClass {
    public static void main(String args[]) {
        
        /* Not Allowed 
        Singleton constructor = new Singleton("Shuvam", 31);
        */

        Singleton s1 = Singleton.initialize();
        System.out.println(s1);

        Singleton s2 = Singleton.initialize();
        System.out.println(s2);

        Singleton s3 = Singleton.initialize();
        System.out.println(s3);

        Singleton s4 = Singleton.initialize();
        System.out.println(s4);

        Singleton s5 = Singleton.initialize();
        System.out.println(s5);

        // All the five reference variable are pointing to the same (Single) object.
    }
}