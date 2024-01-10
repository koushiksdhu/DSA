// Print all the possible permutations of any String/Array:

/*
 * If the length of an array or string is n then total possible permutations will be n! (n-factorial).
 * We can find the all possible permutations using recursive approach.
 */

import java.util.*;

// METHOD 1: Brute force



// public class all_permutations {
//     public static void main(String args[]) {
//         int arr[] = {4, 5, 9};

//         ArrayList<ArrayList<Integer>> al = new ArrayList<>();
//         boolean freq[] = new boolean[arr.length];
//         permute(arr, al, new ArrayList<>(), freq);

//         for(ArrayList<Integer> i : al) {
//            System.out.println(i);
//         }

//         System.out.println("Size: "+al.size());
//     }
//     static private void permute(int nums[], ArrayList<ArrayList<Integer>> al, ArrayList<Integer> ans, boolean freq[]) {
//         if(ans.size() == nums.length) {
//             al.add(new ArrayList<>(ans));
//             return;
//         }

//         for(int i = 0; i < nums.length; i++) {
//             if(!freq[i]) {
//                 freq[i] = true;
//                 ans.add(nums[i]);
//                 permute(nums, al, ans, freq);
//                 ans.remove(ans.size() - 1);
//                 freq[i] = false;
//             }
//         }
//     }
// }




// METHOD 2: Optimized Approach: USing swapping technique

import java.util.*;

public class all_permutations {
    public static void main(String args[]) {
        int arr[] = {4, 5, 9};

        ArrayList<Integer> ans = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];

    }

    private static void permute(int nums[], ArrayList<Integer> al, String n, boolean freq) {
        
        
    }
}
