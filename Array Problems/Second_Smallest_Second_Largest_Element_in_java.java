/*Question: 3

Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples:

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	    Second Largest : 5


Example 2:
Input: [1]
Output: Second Smallest : -1
	    Second Largest : -1
*/

// Method 1: By Sorting the array.

/*public class Q3 {
    public static void main(String args[]){
    int array[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,1,0,10,10, 11, 11, 12, 12, 13};
    if(array.length == 1){
        System.out.println("-1");
        System.exit(0);
    }
    int temp = 0;
    for(int i = 0; i < array.length; i++){
        for(int j = i; j < array.length; j++){
            if(array[i] > array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }
        }   
        int secSmallest = array[0];
        int secHighest = array[array.length - 1];     
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[0]){
                secSmallest = array[i];
                break;
            }
        }
        for(int i = array.length - 2; i >= 0; i--){
            if(array[i] < array[array.length - 1]){
                secHighest = array[i];
                break;
            }
        }
        System.out.println("Seocnd Smallest Element: "+secSmallest+"\n Second Hisghest Element: "+secHighest);
    }
}*/

/* If no duplicates element are present in the array then:
 * Second Largest = array[array.length - 2];
 * Second Smallest = array[1];
 */


 // Method 2: By Using max and min methods and again traversing through the array to get the second smallest and the highest element.

 public class Second_Smallest_Second_Largest_Element_in_java{
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,1,0,10,10, 11, 11, 12, 12, 13};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
                break;
            }
        }
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] < max){
                max = arr[i];
                break;
            }
        }
        System.out.println("Seocnd Smallest Element: "+min+"\n Second Hisghest Element: "+max);
    }
 }