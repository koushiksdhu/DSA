import java.util.*;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Factorial: "+fact(n));
    }
    static int fact(int n){
        if(n == 1)
            return n;
        return n * fact(n-1);
    }
}

// Time Complexity: O(N)