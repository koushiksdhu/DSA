/* Question: 2

 * Given an array, we have to find the largest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 
  
*/

// Method 1: By Sorting the array.

/*public class Q2 {
    public static void main(String args[]){
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
        System.out.println("Largest Element: "+arr[arr.length - 1]);
    }
}*/


// Method 2: By Using Math.Max Function

public class LargestElementInAnArray{
    public static void main(String args[]){
        // int arr[] = {2, 5, 1, 3, 0};
        int arr[] = {8,10,5,7,9};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("Largest Element: "+max);
    }
}