/* Write a program to remove all characters from a string except alphabets in a given string.

Example 1:
Input: string str = "Kous12%hi%%%$k$ *&S ^$#a&^%$#12d34hu"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are removed but the order of remaining alphabets is preserved.

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava
Explanation: Characters 1.&2. along with whitespaces are removed but the order of remaining alphabets is preserved.
*/

import java.util.*;

// * METHOD 1: Optimized

// public class removeCharacterExceptAlphabet {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         for(int i = 0; i < str.length(); i++){

//             if(!(Character.toLowerCase(str.charAt(i)) >= 'a' && Character.toLowerCase(str.charAt(i)) <= 'z')){
//                 str = str.substring(0, i) + str.substring(i+1, str.length());
//                 i--;   
//             }
//         }
//         System.out.println("Only Alphabets: "+str);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using String Buffer

public class removeCharacterExceptAlphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) >= 'a' && Character.toLowerCase(str.charAt(i)) <= 'z')
                  sb.append(str.charAt(i));
        }

        System.out.println("Only Alphabets: "+sb);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)