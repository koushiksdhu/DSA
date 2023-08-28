/* Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. */

import java.util.*;

// Solution 1:

public class RotateAnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, k, i, j = 0;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        System.out.println("Enter the Array Element: ");
        for(i = 0; i < arr.length; i++){
            System.out.print("Index "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        k = sc.nextInt();

        // Logic 1 - O(n)
        // for(i = k+1; i < arr.length; i++){
        //     arr1[j++] = arr[i];
        // }
        // for(i = 0; i <= k; i++){
        //     arr1[j++] = arr[i];
        // }

        // Logic 2 - O(n)
        for (i = 0; i < k; i++){
            arr1[i] = arr[arr.length - k + i];
        }
        for(i = k; i < arr.length; i++){
            arr1[i] = arr[j++];
        }

        // Logic 3: Bubble Rotate - O(n*k)



        System.out.print("Rotated Array is: ");
        for(i = 0; i < arr1.length; i++){
            System.out.print(i < arr1.length - 1 ? arr1[i]+", " : arr1[i]);
        }
    }    
}

// Solution 2:

    

