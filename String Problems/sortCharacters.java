/* Write a program to sort characters (numbers and punctuation symbols are not included) in a given string.

Example 1:
Input: String str = “zxcbg”
Output: bcgxz
Explanation: After sorting we get string as bcgxz

Example 2:
Input: String str = “edcba”
Output: abcde
Explanation: After sorting we get string as abcde
*/

import java.util.*;

// * METHOD 1: Using Bubble sort

// public class sortCharacters {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         char ch[] = sc.nextLine().toCharArray();

//         for(int i = 0; i < ch.length - 1; i++){
//             for(int j = 0; j < ch.length - i - 1; j++){
//                 if(ch[j]  > ch[j+1]){
//                     char temp = ch[j];
//                     ch[j] = ch[j+1];
//                     ch[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println("Sorted Character: "+String.valueOf(ch));
//     }    
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)


// * METHOD 2: Using inbuilt sort mechanism

public class sortCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char ch[] = sc.nextLine().toCharArray();

        Arrays.sort(ch);
        
        System.out.println("Sorted Character: "+String.valueOf(ch));
    }    
}

// Time Complexity: O(NlogN)
// Space Complexity: O(1)
