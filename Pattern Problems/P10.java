/*
                A 
             A  B  A
          A  B  C  B  A
       A  B  C  D  C  B  A
    A  B  C  D  E  D  C  B  A 

*/


public class P10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char v = 'A';
            for(int j = n; j  > i; j--){
                System.out.print("   ");
            }
            for(int j = 0; j <= i; j++)
                System.out.print(" "+v+++" ");
            v--;
            for(int j = 1; j <= i; j++){
                System.out.print(" "+--v+" ");
            }
            System.out.println();

        }
    }
}
