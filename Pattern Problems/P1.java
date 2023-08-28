/*
             * 
          *  *  * 
       *  *  *  *  * 
    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 

 */

public class P1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n-1; i > -1; i--){
          for(int j = 0; j < i; j++)
            System.out.print("   ");
       
          for(int j = 0; j < 2 * (n-i) - 1; j++)
            System.out.print(" * ");
      
         System.out.println();
        }
    }
}
