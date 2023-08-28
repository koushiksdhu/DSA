// Extract the ith bit of a number.

import java.util.*;

public class extractBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the ith bit: ");
        int i = sc.nextInt();

        int ith = n & (1 << i);
        ith = ith > 0 ? 1 : 0;
        System.out.println("The ith bit of "+n+" is: "+ith);
    }
}
