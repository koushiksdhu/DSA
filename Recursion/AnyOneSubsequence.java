// Any one sub-sequence, whose sum is K.
// In this algorithm, we are avoiding the future recursive calls if we are getting an answer.


import java.util.*;

public class AnyOneSubsequence {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1 };
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 2;
        sum(0, al, 0, sum, arr, arr.length);
    }

    static boolean sum(int idx, ArrayList<Integer> al, int s, int sum, int arr[], int n) {
        if (idx == n) {
            if (s == sum) {
                for (int i : al)
                    System.out.print(i + " ");
                System.out.println();
                return true;
            }
            return false;
        }
        al.add(arr[idx]);
        s += arr[idx];
        if (sum(idx + 1, al, s, sum, arr, n) == true)
            return true;
        al.remove(al.size() - 1);
        s -= arr[idx];
        if(sum(idx + 1, al, s, sum, arr, n) == true)
            return true;
        return false;
        
    }
}