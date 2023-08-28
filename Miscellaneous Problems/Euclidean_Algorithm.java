// * Euclidean theorem states that:
// * gcd(a, b) = gcd(a-b, b), a > b, where a = GREATER NUMBER and b = SMALLER NUMBER
// * After performing the Euclidean operation, one of the number will be 0 and the other non zero number is the GCD/HCF. 

// GCD prints the greatest number that is divisible by both a and b where the greatest number will be in between 1 and Minimum(a,b) [Inclsively] 
// LCM print the smallest number in between a and b [inclusively] which is divisble by both(a, b).

// * NOTES:
// * In Division i.e., % or / Time Complexity is always in logarithmic.
// * Φ (phi) is used instead of other values such as base 10 or base 2 beacause evertime it is being divided by different number so it is fluctuating not constant that's why phi is being used over there.



// * METHOD 1: Using Recursion

public class Euclidean_Algorithm {  
    public static void main(String[] args) {
        int x = 52;
        int y = 10;
        System.out.println("HCF: "+gcd(x, y));
        System.out.println("LCM: "+(x * y)/gcd(x, y));
    }
    static int gcd(int a, int b){
        if(a == 0)          // If a == 0, return other non zero number i.e., b.
            return b;
        else if(b == 0)     // If b == 0, return other non zero numbner i.e., a.
            return a;

        // * Greater - Smaller : Brute Force [Using Subtraction] - Subtraction may take more steps to find the GCD of two number if the one value is so small and the other value is so large.
        // if(a > b)
        //     return gcd(a-b, b);
        // else
        //     return gcd(b-a, a);
        
        // OR

        // * Greater % Smaller : Optimized [Using Modulus] - In less step will get the GCD using modulus operator.
        if(a > b)
            return gcd(a % b, b);
        else
            return gcd(b % a, a);
    }
}

// Time Complexity: O(log Φ(min(a, b)))
// Space Complexity: O(log Φ(min(a, b)))

// * METHOD 2: Using Loop - Most Optimized

// public class Euclidean_Algorithm{
//     public static void main(String args[]){
//         int x = 10, y = 52;
//         System.out.println("HCF: "+gcd(x, y));
//         System.out.println("LCM: "+(x*y)/gcd(x, y));
//     }
//     static int gcd(int x, int y){
//         while(x > 0 && y > 0){
//             if(x > y)
//                 x = x % y;
//             else
//                 y = y % x;
//         }

//         if(x == 0)
//             return y;
//         return x;
//     }
// }

// Time Complexity: O(log Φ(min(a, b)))
// Space Complexity: O(1)