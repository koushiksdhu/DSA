/* Write a program to concatenate one string’s contents to another.
Concatenation means to join two (or more) strings and form a combined string having the characters of both ( or all)
strings in the same order as they were before in separate strings.
*/

import java.util.*;
public class stringConcatenate {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "World";

        // Using + operator
        System.out.println(s1+s2);      // * O(1)

        // Using concat method
        System.out.println(s1.concat(s2));  // * O(1)
        // * In concat() function, a new string is made first which is a time-costly operation.
        // * Therefore we can use the append() function of StringBuilder Class,
        // * which doesn’t make a new array(internal implementation of string) rather expands the already given array to save time.

        // Using StringBuilder Class
        StringBuilder sb = new StringBuilder(s1);   // * O(1)
        sb.append(s2);
        System.out.println(sb);

        // Using charArray

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        char ch[] = new char[ch1.length + ch2.length];
        int i = 0;
        for(int j = 0; j < ch1.length; j++)
            ch[i++] = ch1[j];
        for(int j = 0; j < ch2.length; j++)
            ch[i++] = ch2[j];
        System.out.println(String.valueOf(ch));     // * O(n+m) [Time and Space Complexity]
    }
}
