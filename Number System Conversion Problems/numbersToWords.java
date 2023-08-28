/* Given a number, convert it into the form of words.
Note:- Consider maximum no. of digits in the number as 4.

Example 1:
Input: 7824
Output: seven thousand eight hundred twenty four
Explanation: 7824 in words can be written as seven thousand eight hundred twenty four.

Example 2:
Input: 370
Output: three hundred seventy
Explanation: 370 in words can be written as three hundred seventy.
*/

import java.util.*;

public class numbersToWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.next();
        words(num);
    }

    static void words(String str){
        String singleDigit[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String twoDigit[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String tensDigit[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eight", "Ninety"};
        String tensPower[] = {"Hundred", "Thousand"};

        if(str.length() == 1){
            System.out.print(singleDigit[str.charAt(0) - '0']);
            return;
        }

        int len = str.length();
        
        for(int i = 0; i < str.length(); i++){
            if(len > 2){
                if(str.charAt(i) - '0' != 0){
                    System.out.print(singleDigit[str.charAt(i) - '0']+" "+tensPower[len - 3]+" ");
                }
                len--;
            }
            else{
                if(str.charAt(i) - '0' == 1){
                    System.out.print(twoDigit[str.charAt(i+1) - '0']+" ");
                    return;
                }
                else if(str.charAt(i) - '0' != 0){
                    System.out.print(tensDigit[str.charAt(i) - '0']+" ");
                    if(str.charAt(i+1) - '0' != 0)
                        System.out.print(singleDigit[str.charAt(i+1) - '0']+" ");
                    return;
                }
            }
        }
    }   
}

// Time Complexity: O(N)
// Space Complexity: O(1)
