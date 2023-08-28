/*
  *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  * 
       *  *  *  *  * 
          *  *  * 
             * 
*/


public class P2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i > 0; i--){
            for(int j = 0; j < n-i; j++)
                System.out.print("   ");        // Printing Space.
            
            for(int j = 0; j < 2 * i - 1; j++) 
                System.out.print(" * ");        // Printing Asterisk
            
            System.out.println();
        }
    }    
}
