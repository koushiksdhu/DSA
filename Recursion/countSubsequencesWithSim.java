// Count Subsequences with sum K.

import java.util.ArrayList;

public class countSubsequencesWithSim {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1 };
        int sum = 2;
        int subSeq = sum(0, 0, sum, arr, arr.length);
        System.out.println("No. of subsequences: " + subSeq);
    }

    static int sum(int idx, int s, int sum, int arr[], int n) {
        // condition not satisified (It is done to optimize the code slightly)
        // This must be done if the array does not contains any negative element.
        if (s > sum)
            return 0;
        // The above is the code for slight optimization in case the array does not
        // contain any negative element.
        if (idx == n) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }
        s += arr[idx];
        int left = sum(idx + 1, s, sum, arr, n);
        s -= arr[idx];
        int right = sum(idx + 1, s, sum, arr, n);
        return left + right;
    }
}
