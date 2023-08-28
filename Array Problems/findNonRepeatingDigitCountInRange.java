/** Find the count of all the non repeating digits in the range:
 * 
 * Input: n1 = 11, n2 = 15
 * Output: 4 
 * 
 * Input: n1 = 22, n2 = 33
 * Output: 10
 */


import java.util.*;

public class findNonRepeatingDigitCountInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i = n1; i <= n2; i++){
            sum += count(i);
        }
        System.out.println("Count of unique digit numbers are: "+sum);
    }   
    static int count(int n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(n > 0){
            hm.put(n % 10, hm.getOrDefault(n % 10, 0)+1);
            n /= 10;
        }
        for(int i : hm.values()){
            if(i > 1)
                return 0;
        }
        return 1;
    }
}
