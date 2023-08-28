/* Given an array that contains both negative and positive integers, find the maximum product subarray.

Example 1:

Input: nums = [1,2,3,4,5,0]
Output: 120
Explanation: In the given array, we can see 1×2×3×4×5 gives maximum product value.

Example 2:

Input: nums = [1,2,-3,0,-4,-5]
Output: 20
Explanation: In the given array, we can see (-4)×(-5) gives maximum product value.
*/

// * METHOD 1: Brute Force Approach

// public class Q17 {
//     public static void main(String[] args) {
//         int arr[] = {1,2,-3,0,-4,-5};
//         int prod = 1, maxProd = 1;
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 prod = 1;
//                 for(int k = i; k <= j; k++){
//                     prod *= arr[k];
//                 }
//                 maxProd = Math.max(prod, maxProd);
//             }
//         }
//     System.out.println("Maximum Product: "+maxProd);
//     }
// }

// Time Complexity: O(N^3)
// Space Complexity: O(1)

// * METHOD 2: Using two loops

// public class Q17Imp{
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 0, -4, 5, 0};
//         int maxProduct = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length-1; i++){
//             int prod = arr[i];
//             for(int j = i+1; j < arr.length; j++){
//                 prod *= arr[j];
//                 maxProduct = Math.max(maxProduct, prod);
//             }
//         }
//         System.out.println("Maxuimum Product: "+maxProduct);
//     }
// }

// Time Complexity: O(N^2)
// Space Complexity: O(1)

// * METHOD 3: Two Traversal Approach

// public class Q17Imp{
//     public static void main(String[] args) {
//         int arr[] = {1,2,-3,0,-4,-5};
//         int maxLeft = 0, maxRight = 0, prod = 1;

//         boolean isZero = false;

//         for(int x : arr){
//             if(x == 0){
//                 isZero = true;
//                 prod = 1;
//                 continue;
//             }
//             prod *= x;
//             maxLeft = Math.max(maxLeft, prod);
//         }

//         prod = 1;
//         isZero = false;

//         for(int j = arr.length - 1; j <= 0; j--){
//             if(arr[j] == 0){
//                 isZero = true;
//                 prod = 1;
//                 continue;
//             }
//             prod *= arr[j];
//             maxRight = Math.max(maxRight, prod);
//         }

//         if(isZero == true)
//             System.out.println(Math.max(Math.max(maxLeft, maxRight), 0));
//         else
//             System.out.println(Math.max(maxLeft, maxRight));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * Method 4: Using Kadane's Theorem

public class Max_product_subarray{
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i = 0; i < arr.length; i++){
            prod *= arr[i];
            
        System.out.println(max);
        }
    }
}

