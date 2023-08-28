/** Write a Java program in which a string should be taken as an input and based on that input if a particular character
 * appears consecutively more than once then all the repeated character should be replaced with corresponding 
 * frequency and that character. 
 * 
 * Input: Hello
 * Output: He2lo
 * 
 * Input: Good
 * Output: G2od
 * 
 * Input: Sunny
 * Output: Su2ny
 * 
 * Input: Cross-Selling
 * Output: Cro2s-Se2ling
 */


import java.util.*;

public class frequencyAndLetter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int i = 0;
        int j = 1;
        int count = 1;
        String res = "";
        while(i < str.length() && j < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }
            else{
                if(count > 1){
                    res += "" + count + str.charAt(i);
                    count = 1;
                }
                else
                    res += str.charAt(i);
                i = j;
                j++;
            }
            if(j == str.length()){
                if(count > 1){
                    res += "" + count + str.charAt(i);
                    count = 1;
                }
                else
                    res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
