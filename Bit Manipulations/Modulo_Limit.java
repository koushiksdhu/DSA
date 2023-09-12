// Limit 10^9+7 working:
/* NOTES:
 * (a + b) % M = ((a % M) + (b % M)) % M
 * (a * b) % M = ((a % M) * (b % M)) % M
 * (a - b) % M = ((a % M) - (b % M) + M) % M
 * (a / b) % M = ((a % M) * ((b^-1) % M)) % M

 * 


 */

import java.util.*;
public class Modulo_Limit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        long fact = 1;
        
        long M = (long)1e9+7;
        for(int i = 2; i <= n; i++){
            fact = (fact * i) % M;
        }
        System.out.println("The factorial of "+n+" is: "+fact);
        System.out.println(M);
    }
}
