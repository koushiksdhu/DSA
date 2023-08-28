/*
    * 
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */


public class P4 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){

            if(i < 5)
                for(int s = 0; s <= i; s++)
                    System.out.print("* ");
         
            else
                for (int s = n-i-1; s > 0; s--)
                    System.out.print("* ");;

            System.out.println();
        }
    }
}
