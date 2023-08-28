// Remove the last set bit.


import java.util.Scanner;

public class removeLastSetBit {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int bit = n & (n-1);
        System.out.println("Value of "+n+" after removing the last set bit is: "+bit);
     }
}
