class Container {
    int l, h, w;

    Container() {
        this.l = this.h = this.w = -1;
        // super();        // Call the object class default constructor because we know that the Object class is the Superclass of all other classes.
        // Every single class inherits the object class.
    }

    Container(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Container(int l) {
        this.l = this.h = this.w = l;
    }

    Container(Container obj) {
        this.l = obj.l;
        this.h = obj.h;
        this.w = obj.w;
    }

    public void displayInfo() {
        System.out.println("Running  the box");
    }
}

class ContainerChild extends Container{
    // int l = super.l;
    int childVariable = 100;
   
    

    // ContainerChild(int l, int h, int w) {
    //     super.l = l;
    //     super.w = w;
    //     super.h = h;
    // } 

    ContainerChild(int l, int h, int w) {
        super(l, h, w);
    } 

    // Calling the parent class constructor using super keyword.
    // Used to initialize values in the parent class. 
    // super keyword cannot access the variables, methods or constructors of the parent class which are declared as a PRIVATE.

    // This the reference variable which determines which member and methods to be accessed,
    // If the refernce variable is of parent class and the object is created of child class then the additional variables and functions which are
    // present in child class cannot be accesses bu the parent class reference variable. It does not permit to access the members and methods of the child
    // class.
}

public class Boxx {
    public static void main(String args[]) {
        // Container c1 = new Container(5, 4, 2);
        // System.out.print(c1.l+" ");
        // System.out.print(c1.w+" ");
        // System.out.println(c1.h+" ");

        // Container c2 = new Container();
        // System.out.print(c2.l+" ");
        // System.out.print(c2.w+" ");
        // System.out.println(c2.h+" ");

        // Container copyConst = new Container(c1);
        // System.out.print(copyConst.l+" ");
        // System.out.print(copyConst.w+" ");
        // System.out.println(copyConst.h+" ");

        // Container c3 = new Container(100);
        // System.out.print(c3.l+" ");
        // System.out.print(c3.w+" ");
        // System.out.println(c3.h+" ");

        // CHILD CLASS OBJECT WHICH EXTENDS PARENT CLASS:
        ContainerChild child1 = new ContainerChild(5, 7, 2);
        System.out.println(child1.l);
        System.out.println(child1.w);
        System.out.println(child1.h);

        // Container parent = new ContainerChild();
        // System.out.println(parent.l);
        // System.out.println(parent.w);
        // System.out.println(parent.h);
        // System.out.println(parent.childVariable);        // Parent class refernce variable cannot access the child class members and methods.
        // It is the type of the reference variable which determines which memebers and function can be accessed.
        // We can only access to the memebers and functions of superclass if the reference varible is of super class.

        // ContainerChild child = new Container();  0    // We cannot have the child class reference variable refering to the parent class object but the reverse is possible with some limitations.
        
    }
}