// Given, a number and an ith bit. Determine whether the ith bit is set or not.
// Never ever alter the data that is given to you.

import java.util.*;

public class checking_ith_bit_is_set_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the ith bit: ");
        int i = sc.nextInt();

        /*
         * mask = 1 << i;
         * isSet = mask & n;
         */
        if((n & (1 << i)) != 0)                     // Condition
            System.out.println("Bit is set.");
        else
            System.out.println("Bit is not set.");
    }
}
