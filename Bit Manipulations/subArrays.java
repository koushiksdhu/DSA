// SubArrays:


import java.util.*;
public class subArrays {
    public static void main(String args[]){
        int arr[] = {1, 3, 2};
        int N = arr.length;

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        int noOfSubsets = (1 << N);     // 0 to 7 total 8 i.e. 2^N

        for(int i = 0; i < noOfSubsets; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int bit = 0; bit < N; bit++){
                if((i&(1<<bit)) != 0){
                    temp.add(arr[bit]);
                }
            }
            al.add(temp);
        }
        for(int i = 0; i < al.size(); i++){
            for(int j = 0; j < al.get(i).size(); j++){
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
