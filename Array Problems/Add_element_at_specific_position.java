/* Question 13: Given an array of N integers, write a program to add
an array element at the beginning, end, and at a specific position.

Input: N = 5, array[] = {1,2,3,4,5}
    insertbeginning(6)
    insertending(7)
    insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 
 


*/
import java.util.*;
public class Add_element_at_specific_position {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5, 0};
        System.out.println("Original Array: "+Arrays.toString(arr));
        // insertBeginning(arr, 6);
        // insertEnding(arr, 4);
        insertAtPos(arr, 4,  500);
        System.out.print("Insert at Beginning: "+Arrays.toString(arr)+"\n");

    }
    static void insertBeginning(int arr[], int value){      // Time Commplexity: O(n)
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
    }

    static void insertEnding(int arr[], int value){         // Time Complexity: O(n)
        arr[arr.length - 1] = value;
    }

    static void insertAtPos(int arr[], int pos, int value){     // Time Complexity: O(n - pos)
        for(int i = arr.length - 1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
    }
}
