/*  Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

Example 1:
Input: string = “123xyz”
Output: 123

Example 2:
Input: string = “1xyz23”
Output: 24
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumOfNumbersInString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.next();
//         String temp = "0";
//         int sum = 0;

//         for(int i = 0; i < str.length(); i++){
//             if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
//                 temp += str.charAt(i);
//             }
//             else{
//                 sum += Integer.parseInt(temp);
//                 temp = "0";
//             }
//         }
//         sum += Integer.parseInt(temp);
//         System.out.println("Sum: "+sum);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 2: Optimized

public class sumOfNumbersInString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int number = 0;
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                number = number * 10 + (str.charAt(i) - '0');
            }
            else{
                sum += number;
                number = 0;
            }
        }
        sum += number;
        System.out.println("Sum: "+sum);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)

