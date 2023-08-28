// Count the number of set bits in a number:


import java.util.Scanner;

// public class countTheSetBits {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         int num = n;
//         int count = 0;
//         while(num > 0){
//             if((num & 1) == 1)
//                 count++;
//             num >>= 1;
//         }
//         System.out.println("Count of set bit in "+n+" is: "+count);
//     }
// }

// Time Complexity: O(Most Significant Bit)

// * Another Approach:

public class countTheSetBits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(num > 0){
            num = num & (num -1);
            count++;
        }
        System.out.println("Count of set bit in "+n+" is: "+count);
    }
}

// Time Complexity: O(No. of Set Bits)
