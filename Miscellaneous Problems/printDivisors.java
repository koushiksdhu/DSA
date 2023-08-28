/*Print Divuisor:

Input: 36
Output  1, 2, 3, 4, 6, 9, 12, 18, 36
*/


// * METHOD 1: Brute Force - O(N)

// public class printDivisors {
//     public static void main(String[] args) {
//         int n = 36;
//         for (int i = 1; i <= n; i++){
//             if(n % i == 0)
//                 System.out.print(i+" ");
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: O(sqrt(N))

public class printDivisors {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                if(i == n/i)
                    System.out.print(i+" ");
                else    
                    System.out.print(i+" "+n/i+" ");
            }
        }
    }
}

// Time Complexirt: O(sqrt(N))
// Space Complexity: O(1)