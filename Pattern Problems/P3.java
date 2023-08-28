/*
       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */
public class P3 {
    public static void main(String[] args) {
        int n = 7;

        // UPPER TRIANGLE
        for(int i = n; i > 0; i--){

            for(int sp = 0; sp < i; sp++)
                System.out.print(" ");                  // Upper Space.

            for(int star = 0; star < 2*(n-i)+1; star++)
                System.out.print("*");                  // Upper Asterisk.
            System.out.println();
        }

        // LOWER TRIANGLE
        for(int i = n-1; i >= 0; i--){
            for(int sp = 0; sp <= n-i; sp++)
                System.out.print(" ");                  // Lower Space.

            for(int star = 0; star < 2*i-1; star++)
                System.out.print("*");                  // Lower Asterisk.

            System.out.println();
        }
        
    }
}
