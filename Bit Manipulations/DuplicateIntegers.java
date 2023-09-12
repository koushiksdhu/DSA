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
        int arr [] = {1, 1, 2, 54, 3, 2, 3, 4, 9, 4};
        
        int xor = 0;
        for(int i : arr)
            xor ^= i;
        
        int mask = 1;
        while((xor&mask) == 0){     //  xor&(~(xor-1))
            mask <<= 1;
        }
        
        int val1 = 0, val2 = 0;
        for(int i : arr){
            if((i&mask) != 0)
                val1 ^= i;
            else
                val2 ^= i;
        }
        
        System.out.println("The number that are present once are: "+val1+" and "+val2);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
