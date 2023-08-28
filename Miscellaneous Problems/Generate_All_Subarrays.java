import java.util.*;
public class Generate_All_Subarrays {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("[");
                for(int k = i; k <= j; k++){
                    String s = k == j ? String.valueOf(arr[k]) : String.valueOf(arr[k]+", ");
                    System.out.print(s);
                }
                System.out.println("]");
            }
        }
    }
}
