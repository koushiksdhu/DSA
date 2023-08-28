/*
    A A A A A 
    B B B B
    C C C
    D D
    E
*/

public class P8 {
    public static void main(String[] args) {
        int n = 5;
        char v = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(v+" ");
            }
            v++;
            System.out.println();
        }
    }
}
