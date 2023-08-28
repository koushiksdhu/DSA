/* MERGE SORT: Divide and Conquer Algorithm - Top Down Approach

Intuition: 

* Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts. 
There are 2 main functions :
* merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
* mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,
    > low = leftmost index of the array
    > high = rightmost index of the array
    > mid = Middle index of the array 
*We recursively split the array, and go from top-down until all sub-arrays size becomes 1.

Approach: We will be creating 2 functions mergeSort() and merge().

* mergeSort(arr[], low, high):

* In order to implement merge sort we need to first divide the given array into two halves. Now, if we carefully observe, we need not divide the array and create a separate array, but we will divide the array’s range into halves every time. For example, the given range of the array is 0 to 4(0-based indexing). Now on the first go, we will divide the range into half like (0+4)/2 = 2. So, the range of the left half will be 0 to 2 and for the right half, the range will be 3 to 4. Similarly, if the given range is low to high, the range for the two halves will be low to mid and mid+1 to high, where mid = (low+high)/2. This process will continue until the range size becomes.

* So, in mergeSort(), we will divide the array around the middle index(rather than creating a separate array) by making the recursive call :
    1. mergeSort(arr,low,mid)   [Left half of the array]
    2. mergeSort(arr,mid+1,high)  [Right half of the array]

* where low = leftmost index of the array, high = rightmost index of the array, and mid = middle index of the array.
Now, in order to complete the recursive function, we need to write the base case as well. We know from abovestep
that our recursion ends when the array has only 1 element left. So, the leftmost index, low,
and the rightmost index high become the same as they are pointing to a single element.
Base Case: if(low >= high) return;

* merge(arr[], low, mid, high):

In the merge function, we will use a temp array to store the elements of the two sorted arrays after merging.
Here, the range of the left array is low to mid and the range for the right half is mid+1 to high.
Now we will take two pointers left and right, where left starts from low and right starts from mid+1.
Using a while loop( while(left <= mid && right <= high)), we will select two elements, one from each half,
and will consider the smallest one among the two. Then, we will insert the smallest element in the temp array.
After that, the left-out elements in both halves will be copied as it is into the temp array.
*/

import java.util.*;

public class mergeSort {
    public static void main(String args[]){
        int arr[] = {9, 6, 3, 7, 7, 9, 4,  4, 1, 8, 5, 2, 0};
        mSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }

    static void mSort(int arr[], int low, int high){
        if(low == high)
            return;
        int mid = low + (high - low) / 2;
        mSort(arr, low, mid);
        mSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high){
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= high){
            if(arr[i] >= arr[j])
                temp[k++] = arr[j++];
            else
                temp[k++] = arr[i++];
        }
        
        while(i <= mid)
            temp[k++] = arr[i++];
 
        while(j <= high)
            temp[k++] = arr[j++];
        
        for(int p = low; p <= high; p++)
            arr[p] = temp[p - low];
    } 
}

// Time Commplexity: O(NlogN)
// Space Complexity: O(N), because of temporary array used.
