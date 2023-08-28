// * INSERTION SORT

/*
 * Select an element in each iteration from the unsorted array(using a loop).
 * Place it in its corresponding position in the sorted part and shift the remaining elements accordingly
 * (using an inner loop and swapping).
 * The “inner while loop” basically shifts the elements using swapping.
*/

import java.util.*;

public class insertionSort {
    public static void main(String args[]){
        int arr[] = {8, 5, 4, 2, 7, 4, 1, 9, 6, 3, 4, 4, 10};

        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }    
}

// Time Complexity: O(N*N)
// Space Complexity: O(1)

/*
The best case occurs if the given array is already sorted. And if the given array is already sorted,
the outer loop will only run and the inner loop will run for 0 times.
So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.
*/
