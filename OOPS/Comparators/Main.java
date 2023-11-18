import java.util.*;

public class Main{
    public static void main(String args[]) {
        Students koushik = new Students(27, 9.51f);
        Students shuvam = new Students(31, 8.47f);
        Students pranay = new Students(03, 8f);
        Students anmol = new Students(41, 7.5f);

        // if(koushik > shuvam) {       // Not allowed
        //     System.out.println("Koushik scored more than Shuvam");
        // }
        // else {
        //     System.out.println("Shuvam scored more than Koushik");
        // }

        Students list[] = {koushik, shuvam, pranay, anmol};
        System.out.println(Arrays.toString(list));


        // Arrays.sort(list, new Comparator<Students>() {
        //     public int compare(Students obj1, Students obj2) {
        //         return (int)Math.floor(obj1.marks - obj2.marks);        // Ascending Order
        //         return -(int)Math.floor(obj1.marks - obj2.marks);        // Descending Order
        //     }
        // });

        // Writing the above comparator code using LAMBDA Expression:
        Arrays.sort(list, (s1, s2) -> (int)Math.floor(s1.marks - s2.marks));        // Ascending Order
        // Arrays.sort(list, (s1, s2) -> -(int)Math.floor(s1.marks - s2.marks));       // Descending Order

        System.out.println(Arrays.toString(list));

    }

    // @Override
    // public int compareTo(Students o) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }
}
