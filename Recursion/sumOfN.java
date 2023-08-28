import java.util.*;

public class sumOfN {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Sum: "+sum(n));
   }

   static int sum(int n){
        if(n == 0)
            return 0;
        return n+sum(n-1);    
   }
}

// Time Complexity: O(N)
