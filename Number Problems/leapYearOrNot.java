/* “Check if given year is a leap year or not”.

Problem Statement: Check if the given year is a leap year or not.

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

Example 2:
Input: 2000
Output: Yes
Explanation: Since 2000 is a leap year answer is “Yes”.

A year is a leap year only if it satisfies the following condition.
> The year is divisible by 400.
> The year is divisible by 4 but not by 100.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class leapYearOrNot {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year: ");
//         int y = sc.nextInt();

//         if(y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
//             System.out.println(y+" is a Leap Year.");
//         else
//             System.out.println(y+" is a not Leap Year.");
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 2: Using GregorianCalendar Class

public class leapYearOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        GregorianCalendar gc = new GregorianCalendar();     // Creating object of the class GregorianCalendar.

        if(gc.isLeapYear(y))
            System.out.println(y+" is a Leap Year.");
        else
            System.out.println(y+" is a not Leap Year.");
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
