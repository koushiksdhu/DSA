// Is a number is a power of 2 ?

import java.util.*;

public class isPowerOf2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        if((n & (n-1)) == 0)
            System.out.println(n + " is a power of 2.");
        else
            System.out.println(n + " is not a power of 2.");
    }
}
