// Blockswap ALgorithm
import java.util.*;
public class BlockSwap_Algorithm {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        blockSwap(arr, 0, k, arr.length);
        System.out.println("After Rotating the array: "+Arrays.toString(arr));
    }

    static void swap(int arr[], int a, int b, int k){
        for(int i = 0; i < k; i++){
            int temp = arr[a + i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
    }

    static void blockSwap(int arr[], int start, int k, int n){
        if(k == 0 || k == n)
            return;

        if(k == n - k)  {
            swap(arr, start, n - k + start, k);
            return;
        }

        else if(k < n - k){
            swap(arr, start, n - k + start, k);
            blockSwap(arr, start, k, n - k);
        }

        else{
            swap(arr, start, k, n - k);
            blockSwap(arr, n - k + start, 2 * k - n, k);
        }
    }
}
