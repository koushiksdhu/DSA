// * NEXT PERMUTATION

/* Approach: 

The steps are the following:

* Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i] becomes
    smaller than arr[i+1].
* For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing). Here from the back of the
    array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.
* To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i] is less than the
    value at index (i+1) i.e. arr[i+1].
* If such a break-point does not exist i.e. if the array is sorted in decreasing order, the given permutation is the last one in the
    sorted order of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.
* So, in this case, we will reverse the whole array and will return it as our answer.
* If a break-point exists:
* Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
* Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.
*/

/*
 1. Find the break point: arr[i+1] > arr[i].
 2. Get the bigger element which is close to breakpoint element.
 3. Reverse the element from idx+1 to arr.length-1 or sort the element from idx+1 to arr.length-1.
 */

import java.util.*;
public class nextPermutation {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 6, 5, 4};

        int idx = -1;

        for(int i = arr.length-2; i >=0; i--){      // Finding the break-point
            if(arr[i+1] > arr[i]){
                idx = i;
                break;
            }
        }

        boolean idxExist = true;
        if(idx < 0)
            idxExist = false;

        if(idxExist){
            for(int i = arr.length-1; i > idx; i--){
                if(arr[i] > idx){
                    swap(arr, i, idx);      // Calling swap function.
                    break;
                }
            }
        }

        reverse(arr, idx+1, arr.length-1);      // Calling reverse function.
        System.out.println("Next Permuted Array: "+Arrays.toString(arr));
    }
    static void swap(int arr[], int i, int j){      // Swapping
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int i, int j){   // Reversing
        while(i < j)
            swap(arr, i++, j--);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)