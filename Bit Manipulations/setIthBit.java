// Set ith bit of a number.

import java.util.*;

public class setIthBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the position where want to set the bit: ");
        int i = sc.nextInt();

        int setBit = n | (1 << i);
        System.out.println("Value of "+n+" after bit is set at "+i+" position is: "+setBit);
    }    
}
