/* Question 1: 
 * Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
 */

 // Method 1: By Sorting the array and getting the 0th index element.

/*public class Q1{
    public static void main(String args[]){
        // int arr[] = {2, 5, 1, 3, 0};
        int arr[] = {8,10,5,7,9};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Smallest Element: "+arr[0]);
    }
}

// TC: O(N^2)
// SC: O(1)
*/

 // Method 1: By using Math.Max Method.

public class SmallestElementInAnArray{
    public static void main(String args[]){
        // int arr[] = {2, 5, 1, 3, 0};
        int arr[] = {8,10,5,7,9};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        System.out.println("Smallest Element: "+min);
    }
}

// TC: O(N)
// SC: O(1)
