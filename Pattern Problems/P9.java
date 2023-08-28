/*
    A B C D E 
    A B C D
    A B C
    A B
    A
*/

public class P9 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char v = 'A';
            for(int j = 0; j < n - i; j++){
                System.out.print(v+++" ");
            }
            System.out.println();
        }
    }
}
