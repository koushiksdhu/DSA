/*  Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
*/



public class countMaximumConsecutiveOnes {
    public static void main(String args[]){
        int prices[] = {1, 1, 0, 1, 1, 1, 1, 0, 1};

        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] == 1)
                sum++;
            else if(prices[i] == 0)
                sum = 0;
            max = Math.max(max, sum);
        }
        System.out.println("Maximum Consecutive 1's: "+max);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)
