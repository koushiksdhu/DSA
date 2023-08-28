/* Given two strings text and pattern find the first occurrence of str1 in str2 if found print it’s index if not found print -1.

Example 1:
Input: str1 = "takeuforward"
       str2 = “forward”
Output: 5
Explanation: "Forward" is present in the 5th index in "takeuforward"

Example 2:
Input: str1 = “hello”
       str2 = “az”
Output: -1
Explanation: "az" is not a substring of "hello"
*/

import java.util.*;

// * METHOD 1: Brute Force

public class positionOfSubstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String ss = sc.nextLine();

        int pos = -1;
        for(int i = 0; i < str.length(); i++){
            int temp = i;
            int j = 0;
            for(j = 0; j < ss.length(); j++){
                if(str.charAt(temp) != ss.charAt(j)){
                    break;
                }
                temp++;
            }
            if(j == ss.length()){
                pos = i;
                break;
            }
        }
        
        System.out.println("Position: "+pos);
    }    
}

// Time Complexity: O(N*N)
// Space Complexity: O(1)


// * METHOD 2: Using indexOf() method

// public class positionOfSubstring {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();
//         System.out.print("Enter the substring: ");
//         String ss = sc.nextLine();
        
//         int idx = str.indexOf(ss);
//         // * The indexOf( ) method in java will return the first occurrence of specified characters in a string.
        
//         System.out.println("Position: "+idx);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

 
