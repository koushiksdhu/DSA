/* Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
The union of two arrays can be defined as the common and distinct elements in the two arrays.
NOTE: Elements in the union should be in ascending order.

Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}

Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5} 
*/

import java.util.*;

// * METHOD 1: Using ArrayList

// public class unionOfTwoArray{
//     public static void main(String args[]){
//         int arr1[] = {10,1,2,7,3,4,5};
//         int arr2[] = {16,2,3,4,6,4,5};

//         ArrayList<Integer> union = new ArrayList<>();

//         for(int i : arr1){
//             if(!union.contains(i))
//                 union.add(i);
//         }
//         for(int i : arr2){
//             if(!union.contains(i))
//                 union.add(i);
//         }
        
//         Collections.sort(union);    // Sorting
//         System.out.println(Arrays.toString(union.toArray()));
//     }
// }

// Time Complexity: O(NlogN)
// Space Complexity: O(N)


// * METHOD 2: Using HashSet

// public class unionOfTwoArray{
//     public static void main(String args[]){
//         int arr1[] = {1, 35};
//         int arr2[] = {6, 9, 13, 15, 20, 25, 29, 46};

//         HashSet<Integer> union = new HashSet<>();

//         for(int i : arr1)
//                 union.add(i);

//         for(int i : arr2)
//                 union.add(i);

//         System.out.println(Arrays.toString(union.toArray()));
//     }
// }

// * Time Complexity: O( (m+n)log(m+n) ) . Inserting a element in set takes logN time, where N is no of elements in set.
// At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. So Inserting m+n th element takes log(m+n) time.
// Upon approximation across inserting all elements in worst it would take O((m+n)log(m+n) time.
// Using HashSet also takes the same time, On average insertion in unordered_set takes O(1) time but sorting the union vector takes O((m+n)log(m+n)) time.
// Because at max union vector can have m+n elements.
// * Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 


// * METHOD 3: Using HashMap

// public class unionOfTwoArray{
//     public static void main(String args[]){
//         int arr1[] = {1,2,7,3,4,5};
//         int arr2[] = {2,3,4,6,4,5};

//         HashMap<Integer, Integer> union = new HashMap<>();

//         for(int i : arr1)
//             union.put(i, union.getOrDefault(i, 0) + 1);

//         for(int i : arr2)
//             union.put(i, union.getOrDefault(i, 0) + 1);

//         System.out.println(Arrays.toString(union.keySet().toArray()));
//     }
// }

// * Time Complexity: O( (m+n)log(m+n) ) . Inserting a element in set takes logN time, where N is no of elements in set.
// At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. So Inserting m+n th element takes log(m+n) time.
// Upon approximation across inserting all elements in worst it would take O((m+n)log(m+n) time.
// Using HashSet also takes the same time, On average insertion in unordered_set takes O(1) time but sorting the union vector takes O((m+n)log(m+n)) time.
// Because at max union vector can have m+n elements.
// * Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 

// * METHOD 4: Using TreeSet
// Does not holds any duplicate elements.
// Maintains sorted order.

// public class unionOfTwoArray{
//     public static void main(String args[]){
//         int arr1[] = {1,2,7,3,4,5};
//         int arr2[] = {2,3,4,6,4,5};

//         TreeSet<Integer> union = new TreeSet<>();

//         for(int i : arr1)
//             union.add(i);

//         for(int i : arr2)
//             union.add(i);

//         System.out.println(Arrays.toString(union.toArray()));
//     }
// }

// * Time Complexity: O( (m+n)log(m+n) ) . Inserting a element in set takes logN time, where N is no of elements in set.
// At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. So Inserting m+n th element takes log(m+n) time.
// Upon approximation across inserting all elements in worst it would take O((m+n)log(m+n) time.
// Using HashSet also takes the same time, On average insertion in unordered_set takes O(1) time but sorting the union vector takes O((m+n)log(m+n)) time.
// Because at max union vector can have m+n elements.
// * Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 


// * METHOD 5: Using two pointers
// Both arrays must be sorted.

public class unionOfTwoArray{
    public static void main(String args[]){
        int arr1[] = {1, 35};
        int arr2[] = {6, 9, 13, 15, 20, 25, 29, 46};

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else{
                if(union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }

        while(i < arr1.length){     // Remaining elements in arr1.
            if(union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while(j < arr2.length){     // Remaining elements in arr2.
            if(union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        System.out.println(Arrays.toString(union.toArray()));
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)
