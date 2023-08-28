/** Question 10: Given an unsorted array, find the median of the given array.
  
For a small data set, you first count the number of data points (n) and arrange the data points in increasing order.
If the number of data points is uneven, you add 1 to the number of points and divide the results by 2 to get the rank of the data point,
whose value is the median.

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 
 */


import java.util.*;
public class Median_of_an_array {
    public static void main(String args[]){
        int arr[] = {2,5,1,7};
        Arrays.sort(arr);

        if(arr.length % 2 == 0){
            float i = arr[(arr.length / 2) - 1];
            float j = arr[arr.length / 2];
            System.out.println("Median: "+(i+j)/2);
        }

        else
            System.out.println("Median: "+arr[arr.length / 2]);
    }
}

// Time Complexity: O(nlogn).
// Space Complexity: O(1).
