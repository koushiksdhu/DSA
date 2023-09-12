// Subsequence sum whose sum is K.

import java.util.*;

public class subsequenceSum {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1 };
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 2;
        sum(0, al, 0, sum, arr, arr.length);
    }

    static void sum(int idx, ArrayList<Integer> al, int s, int sum, int arr[], int n) {
        if (idx == n) {
            if (s == sum) {
                for (int i : al) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        al.add(arr[idx]);
        s += arr[idx];
        sum(idx + 1, al, s, sum, arr, n);
        al.remove(al.size() - 1);
        s -= arr[idx];
        sum(idx + 1, al, s, sum, arr, n);
    }
}