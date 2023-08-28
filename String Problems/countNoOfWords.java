// Write a program to count the number of words in a given string.

import java.util.*;

// * METHOD 1: Brute Force

public class countNoOfWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        int count = 1;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
                count++;
        }
        System.out.println("Total No. of words: "+count);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using split() method

// public class countNoOfWords {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();
//         String strArray[] = str.split(" ");
//         int count = 0;
//         for(int i = 0; i < strArray.length; i++){
//             if(strArray[i].length() > 0)
//                 count++;
//         }
//         System.out.println("Total No. of words: "+count);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(N)