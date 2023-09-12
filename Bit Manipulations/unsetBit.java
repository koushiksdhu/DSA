// UnSet the bit at ith place:

/*
    * To set bit: [num | (1 << iBit)]
    * To unset bit: [num & (~(1 << iBit))] 
    * ~ (Tilde Operator) inverts the binary.
 */

import java.util.*;
public class unsetBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the bit number that is to be unset: ");
        int i = sc.nextInt();
    
        int mask = ~(1 << i);
        int bit = n & mask;

        printBinary(n);
        printBinary(mask);
        System.out.println("----------");
        printBinary(bit);
    }
    static void printBinary(int decimal){
       for(int i = 8; i >= 0; i--)
            System.out.print((decimal >> i) & 1);
        System.out.println();
    }    
}
