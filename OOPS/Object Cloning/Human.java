public class Human implements Cloneable{
    String name;
    int age;
    int arr[];
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5, 6};
    }

    public Human(Human other) {     // In this constructor object of Human type should be passed as a parameter.
        this.name = other.name;
        this.age = other.age;
    }

    // public Object clone() throws CloneNotSupportedException{     // Shallow Copy
    //     return super.clone();  
    // }

    public Object clone() throws CloneNotSupportedException{        // Deep Copy
        Human deepCopy = (Human)super.clone();      
        
        deepCopy.arr = new int[deepCopy.arr.length];
        for(int i = 0; i < deepCopy.arr.length; i++) {
            deepCopy.arr[i] = this.arr[i];
        }
        return deepCopy;
    }
    


}
