/*
        A 
        A B
        A B C
        A B C D
        A B C D E
 */

public class P7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char v = 'A';
            for(int j = 0; j <= i; j++){
                System.out.print(v+++" ");
            }
            System.out.println();
        }
    }
}
