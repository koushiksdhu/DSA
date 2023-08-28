/* Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4

Example 2:
Input: string str=”India won the cricket match”
Output:
Vowels: 8
Consonants: 15
White spaces: 4
*/

import java.util.*;

public class countVowelsConsonantsWhitespaces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str);

        int consonants = 0;
        int vowels = 0;
        int whitespaces = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowels++;
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                consonants++;
            else if(str.charAt(i) == ' ')
                whitespaces++;
        }
        System.out.println("Consonants: "+consonants+"\nVowels: "+vowels+"\nWhitespaces: "+whitespaces);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)
