/*
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

public class p5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int v = i % 2 == 0 ? 0 : 1;     // if the row no is odd then print 1 first and if even then print 0 first.
            for(int j = 0; j < i; j++){
                System.out.print(v+" ");
                v = v == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
