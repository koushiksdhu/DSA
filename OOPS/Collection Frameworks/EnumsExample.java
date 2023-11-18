// ENUMS: Enums are basically a group of variables which stores a constant value. 


public class EnumsExample {
    
    enum Week implements EnumInterface{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are basically called ENUM constants.
        // Every single one over here is PUBLIC, STATIC and FINAL member.
        // Since, it is final we cannot create child enums.
        // Its datatype is week.
        // Enum cannot extend class.

        // ENUM Constructor:

        Week() {        // This is not public or protected, only private or default.
            // why ? -> We don't want to create new objects because this is not an enum concept that's why.
            System.out.println("Constructor called for "+ this);
        }

        public void greet() {
            System.out.println("This is an Interface signature whose body is declared in enum");
        }

        // Internally, the constructor is something like this: public static final week Monday = new Week();
        // All the enum explicitly extend java.lang.enum class. An enum cannot extend anything else.
        // An enum cannot be a super class rather. 
        // We can implements the interface in enum and declare the abstract methods body in enum.
        // Enum can implement as many interface as we want.

    }

    public static void main(String args[]) {
        Week week;
        week = Week.Friday;
        // System.out.println(week);   // -> Monday

        // for(Week day : Week.values()) {
        //     System.out.println(day);
        // }
        // /*
        //     Monday
        //     Tuesday
        //     Wednesday
        //     Thursday
        //     Friday
        //     Saturday
        //     Sunday
        // */

        // System.out.println(week.ordinal());     // ordinal() basically returns the postion of the enumeration constant.

        week.greet();

        System.out.println(Week.valueOf("Sunday"));     // Actually returning the enum constant.
    }    
}
