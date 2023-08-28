import java.util.*;
public class GFG1
{
	public static void main(String[] args) {
	    // ArrayList<Integer> arr = new ArrayList<>();
// 	    arr.add(3);
// 	    arr.add(1);
//         arr.add(5);
//         arr.add(8);
        
// 	    int coins = 0;
// 		int max = Integer.MIN_VALUE;
//         while(arr.size() > 0){
// 		for(int i = 0; i < arr.size(); i++){
// 		    max = arr.get(i);
//             if(arr.size() != 1){
//                 for(int j = 0; j < arr.size(); j++){
//                     if(max > arr.get(j)){
//                         max = arr.get(j);
//                     }
//                 }
//             }
// 		    int index = arr.indexOf(max);
// 		    int left = index - 1 == -1 ? 1 : arr.get(index - 1);

// 		    System.out.println("Left: "+left);
//             System.out.println("max: "+max);
// 		    int right = index + 1 == arr.size() ? 1 : arr.get(index + 1);
// 		    System.out.println("Right: "+right);
// 		    coins += left * max * right;
// 		    System.out.println("Coins: "+coins);
// 		    System.out.println("Remove: "+arr.remove(index)+"\n");
//             i = -1;
// 		    }
// 	    	System.out.println(coins);
//     	}
// }
// }
int count = 1, distance = Integer.MAX_VALUE, value = 0;
        int a[] = {3, 4, 1, 3, 4, 4};
        int k = 2;
        for(int i = 0; i < a.length - 1; i++){
            count = 1;
            for(int j = 1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    if(count == k){
                        if(j - i < distance){
                            value = a[i];
                            distance = j - i;
                        }
                    }
                }
            }
        }
        System.out.println(value);
    }
}