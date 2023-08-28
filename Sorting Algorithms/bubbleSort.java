// * BUBBLE SORT

import java.util.*;

// * METHOD 1:

// public class bubbleSort{
//     public static void main(String[] args) {
//         int arr[] = {9, 8, 4, 3, 5, 2, 1, 7, 6, 5};
//          boolean swap = false;
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = 0; j < arr.length - i - 1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                      swap = true;
//                 }
//             }
//              if(swap)                // to reduce the time complexity if the array is already sorted.
//                  break;
//         }
//         System.out.println("Sorted Array: "+Arrays.toString(arr));
//     }   
// }

// Time Complexity: O(N*N) for the worst and average cases and O(N) for the best case.
// Space Complexity: O(1)


// * METHOD 2:

public class bubbleSort{
    public static void main(String[] args) {
        int arr[] = {9, 8, 4, 3, 5, 2, 1, 7, 6, 5};
        boolean swap = false;
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap)        // to reduce the time complexity if the array is already sorted.
                break;
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }   
}

/*
 * The best case occurs if the given array is already sorted.
 * We can reduce the time complexity to O(N) by just adding a small check inside the loops. 
 * We will check in the first iteration if any swap is taking place.
 * If the array is already sorted no swap will occur and we will break out from the loops. 
 * Thus the iteration of the outer loop will be just 1. And our overall time complexity will be O(N).
 */
// Time Complexity: O(N*N) for the worst and average cases and O(N) for the best case.
// Space Complexity: O(1)