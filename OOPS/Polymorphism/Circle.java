class Circle extends Shapes {
     // This will run when object if circle class is created.
    // Hence it is overriding the parent class method.
    
    @Override   // This is called annotations.
    void area() {
        System.out.println("Area of a circle is pie * r *r");
    }
}
