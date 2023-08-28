/**Question 9: Given an array, we have to find the average of all the elements in the array.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8  

*/
import java.util.stream.IntStream;
public class Average_of_all_elements {
    public static void main(String args[]){
        int arr[] = {1,2,1,1,5,1};
        System.out.println("Average: "+(float)IntStream.of(arr).sum() / arr.length);
    }
}

// Time Complexity: O(n).
// Space Complexity: O(1) Auxiliary Space.
