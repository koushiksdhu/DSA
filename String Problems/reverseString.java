// * Write a program that reverses a given string (in-place).

import java.util.*;

// * METHOD 1: Brute Force

// public class reverseString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         String reverse = "";

//         for(int i = 0; i < str.length(); i++)
//             reverse = str.charAt(i) + reverse;
        
//         System.out.println("Reverse String: "+reverse);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 2: Using two pointers

// public class reverseString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         char str[] = sc.nextLine().toCharArray();
//         int i = 0;
//         int j = str.length - 1;
        
//         while(i < j){   
//             char temp = str[i];
//             str[i] = str[j];
//             str[j] = temp;
//             i++;
//             j--;
//         }

//         System.out.println("Reverse String: "+Arrays.toString(str));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 3: Using stack

// public class reverseString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();
        
//         Stack<Character> stk = new Stack<>();

//         for(int i = 0; i < str.length(); i++)
//             stk.push(str.charAt(i));

//         str = "";
//         while(!stk.isEmpty()){
//             str += stk.pop();
//         }
        
//         System.out.println("Reverse String: "+str);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 4: Using StringBuilder (Inbuilt Class)

public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Reverse String: "+sb.reverse().toString());
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)