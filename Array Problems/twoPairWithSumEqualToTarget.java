/* Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
 */

 // * METHOD 1: Brute Force

// public class twoPairWithSumEqualToTarget {
//     public static void main(String args[]){
//         int arr1[] = {1, 2, 4, 5, 7};
//         int arr2[] = {5, 6, 3, 4, 8};
//         int target = 9;
//         for(int i = 0; i < arr1.length; i++){
//             for(int j = 0; j < arr2.length; j++){
//                 if(arr1[i]+arr2[j] == target){
//                     System.out.println("("+arr1[i]+", "+arr2[j]+")");
//                     System.out.println("Index: "+"["+i+", "+j+"]");
//                 }
//             }
//         }
//     }
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)

import java.util.*;

// * METHOD 2: Using ArrayList

// public class twoPairWithSumEqualToTarget {
//     public static void main(String args[]){
//         int arr1[] = {-1, -2, 4, -6, 5, 7};
//         int arr2[] = {6, 3, 4, 0};
//         int target = 8;
        
//         ArrayList<Integer> al = new ArrayList<>();

//         for(int i = 0; i < arr2.length; i++)
//             al.add(arr2[i]);
        
//         for(int i = 0; i <  arr1.length; i++){
//             int temp = target - arr1[i];
//             if(al.contains(temp)){
//                 System.out.println("Values: ("+arr1[i]+", "+temp+")");
//                 System.out.println("Index: ["+i+", "+al.indexOf(temp)+"]\n");
//             }
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 3: Using HashMap

// public class twoPairWithSumEqualToTarget {
//     public static void main(String args[]){
//         int nums[] = {2,7,11,15};
//         int target = 9;
        
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int rs[] = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             int temp = target - nums[i];
//             if(hm.containsKey(temp)){
//                 rs[0] = hm.get(temp);
//                 rs[1] = i;
//                 break;
//             }
//             else
//                 hm.put(nums[i], i);
//         }
//         System.out.println("("+rs[0]+", "+rs[1]+")");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 4: Using Two Pointer

public class twoPairWithSumEqualToTarget {
    public static void main(String args[]){
        int nums[] = {1, 2, 4, 5, 7, 6, 4, 8};
        int target = 9;
        
        Arrays.sort(nums);      // Sorting
        
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while(left < right){
            sum = nums[left] + nums[right];
            if(sum == target){
                System.out.println("("+nums[left]+", "+nums[right]+")");
                left++;
                right--;
            }
            else if(sum > target)
                right--;
            else if(sum < target)
                left++;
        }
    }
}

// Time Complexity: O(NlogN)
// Space Complexity: O(1)