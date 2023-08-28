/*
        E 
        D E
        C D E
        B C D E
        A B C D E
 */


public class P11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            char v = (char)('A' + n - i);
            for(int j = 1; j <= i; j++){
                System.out.print(v+++" ");
            }
            System.out.println();
        }
    }
}
