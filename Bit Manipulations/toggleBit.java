/* Toggle the bit: 
 * Toggle: [n ^ (1 << iBit)]
 *  XOR operator is used to perform bit toggle.
*/

import java.util.*;
public class toggleBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the bit number that is to be toggled: ");
        int i = sc.nextInt();
        
        int mask = 1 << i;
        int toggled = n ^ mask;
        

        printBinary(n);
        printBinary(mask);
        System.out.println("----------");
        printBinary(toggled);
    }
    static void printBinary(int decimal){
       for(int i = 8; i >= 0; i--)
            System.out.print((decimal >> i) & 1);
        System.out.println();
    }
}
