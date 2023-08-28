// Checking the number is Odd or Even using & (AND) operator:
// AND (&) operator is way more faster than +, -, /, %

import java.util.*;

public class andOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if((n & 1) == 0)        // For Odd number last bit is always 1 and for an Even number last bit is always 0.
            System.out.println(n+" is an Even Number.");
        else
            System.out.println(n+" is a Odd Number.");
    }
}
