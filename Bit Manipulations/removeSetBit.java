// Remove Set Bit:

import java.util.Scanner;

public class removeSetBit {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the bit you want to remove: ");
        int i = sc.nextInt();

        int bit = n & ~(1 << i);
        System.out.println("The value of "+n+" after removing set bit from "+i+" position is: "+bit);
   }
}
