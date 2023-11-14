import java.util.Arrays;

public class intro {
    public static void main(String args[]) {
        // You have been asked to store 5 roll numbers.
        int arr[] = new int[5];
        arr[0] = 50;
        arr[1] = 15;
        arr[2] = 25;
        arr[3] = 45;
        arr[4] = 55;
        System.out.println(Arrays.toString(arr));

        // Store 5 names.
        String str[] = new String[5];
        str[0] = "Pritam";
        str[1] = "Aman";
        str[2] = "Shuvam";
        str[3] = "Akash";
        str[4] = "Pranay";
        System.out.println(Arrays.toString(str));

        

        // Student s1;     // Declaring the reference variable of type s1.
        // System.out.println(s1);        // will throw an error because it is declared but s1 reference variable is not been initialized yet.

        // Creating object of the student class:
        Student s1 = new Student();
        // new keyword allocates memory in the heap during runtime and returns the refernce to it which is being stored in the reference variable.
        System.out.println(s1.name);        // default value: NULL
        System.out.println(s1.roll);        // default value: 0
        System.out.println(s1.marks+"\n");       // default value: 0.0

        s1.name = "Koushik Sadhu";
        s1.roll = 27;
        s1.marks = 91.80f;

        Student s2 = new Student();
        System.out.println(s2.roll);        
        System.out.println(s2.name);        
        System.out.println(s2.marks+"\n");
        
        Student s3 = new Student(31, "Soubhik Sadhu", 95);
        System.out.println(s3.roll);        
        System.out.println(s3.name);        
        System.out.println(s3.marks);

        Student copyObj = s3;
        System.out.println(copyObj.name);        
        System.out.println(copyObj.roll);        
        System.out.println(copyObj.marks);

        final Integer a = 40;
        System.out.println(a);
        a = 50;
        System.out.println(a);


        
        

    }
    // Store Data of 5 students (i.e., Student Roll no., Name and Marks)
        static class Student {     // User defined datatype template that is used to group properties and functions together.
            int roll;
            String name;
            float marks;

            // Student() {
            //     this.roll = 27;
            //     this.name = "Koushik Sadhu";
            //     this.marks = 83.60f;
            // }

            Student(int roll, String name, float marks) {
                this.roll = roll;
                this.name = name;
                this.marks = marks;
            }

            Student() {
                this(1, "This", 100f);
            }

        }
}

// When a non-primitive is final then we cannot reassign it.