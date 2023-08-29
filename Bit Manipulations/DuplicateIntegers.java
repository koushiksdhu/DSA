// Every Integer appears twice and two Integer appears once. Find those two Integers.
// Input: [1, 1, 2, 5, 3, 2, 3, 4, 7, 4]
// Output: 5 and 7 appearing once.

/*
 * Solution: What we can do is we can perform xor ooperation of the above so the XOR is single elements 5 and 7 will be 2.
                5:   1 0 1
                7: ^ 1 1 1
                -------------
                     0 1 0
            Here, the 1th bit is set ie., 1 that means 1st bit of 5 and 1st bit of 7 is opposite.
            And we know that we XOR 1 ^ 0 = 1 and 1 ^ 1 = 0.
            So, what we can do is just make two sets where we will store the values whose 1st bit is set and 1st bit is not set.
            
            1st bit is set  |   1st bit is not set
                    2       |           1
                    7       |           1
                    3       |           5   
                    2       |           4
              ^     3       |           4
           _______________________________________
              2^7^3^2^3 = 7 |     1^1^5^4^4 = 5
    
              Got those two intgers which are present once in an array.
*/


public class DuplicateIntegers {
    public static void main(String args[]){
        int arr [] = {1, 1, 2, 5, 3, 2, 3, 4, 7, 4};
        int xor = arr[0];
        
        // Calculating XOR value:
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }

        // Getting the set bit:
        int count = 0;
        int temp = xor;
        while(temp > 0){
            if((temp & 1) == 1)
                break;
            else{
                temp >>= 1;
                count++;
            }
        }

        // Getting the mask value:
        int setBit = xor & (1 << count);
        System.out.println(setBit);
        
        int num1 = 0, num2 = 0;

        // Creating two sets and bifurcating the set bit and non-set bit values:
        for(int i : arr){
            if((i & setBit) != 0)
                num1 ^= i;
            else
                num2 ^= i;
        }

        System.out.println("The number that are present once are: "+num1+" and "+num2);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
