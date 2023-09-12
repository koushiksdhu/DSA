/* Binary Numbers: Numbers containing 1's and 0's.
 * We can convert any number to Binary Number.
 * Odd no.s lasst bit is set whereas even no.s last bit is not set.
 * To calculate power of 2 use: (1 << N)
*/


import java.util.*;
public class BinaryNumbers {
    public static void main(String args[]){
        System.out.println(binaryToDecimal(1111111111));
        System.out.println(decimalToBinary(255));

        // Maximum 32-bit number:
        int max = (1<<31)-1;
        System.out.println("MAX VALUE: "+max);
        int min = (1<<31)*-1;
        System.out.println("MIN VALUE: "+min);

    }
    static long binaryToDecimal(int n){
        long i = 0, last = 0;
        while(n > 0){
            last += (n % 10) * 1<<i++;
            n /= 10; 
        }
        return last;
    }
    static String decimalToBinary(int n){
        String ans = "";
        while(n >= 2){
            ans = "" + (n % 2) + ans;
            n /= 2;
        }
        ans = "" + (n % 2) + ans;
        return ans;
    }
}
