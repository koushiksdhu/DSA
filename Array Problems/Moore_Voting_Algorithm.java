// * Moore's Voting Algorithm:

/* If the array contains a majority element, its occurrence must be greater than the floor(N/2).
Now, we can say that the count of minority elements and majority elements are equal up to a certain point in the array.
So when we traverse through the array we try to keep track of the count of elements and the element itself for which
we are tracking the count. After traversing the whole array, we will check the element stored in the variable.
If the question states that the array must contain a majority element, the stored element will be that one but
if the question does not state so, then we need to check if the stored element is the majority element or not.
If not, then the array does not contain any majority element.

APPROACH:
 * Initialize 2 variables:
        > Count –  for tracking the count of element.
        > Element – for which element we are counting.
 * Traverse through the given array.
        > If Count is 0 then store the current element of the array as Element.
        > If the current element and Element are the same increase the Count by 1.
        > If they are different decrease the Count by 1.
 * The integer present in Element should be the result we are expecting.

 Basically, we are trying to keep track of the occurrences of the majority element and minority elements dynamically.
 That is why, in iteration 4, the count becomes 0 as the occurrence of Element and the occurrence of the other elements are the same.
 So, they canceled each other.This is how the process works. The element with the most occurrence will remain and the rest will
 cancel themselves. Here, we can see that 2 is the majority element. But if in this array, the last two elements were 3,
 then the Element variable would have stored 3 instead of 2. For that, we need to check if the Element is the majority element
 by traversing the array once more. But if the question guarantees that the given array contains a majority element,
 then we can bet the Element will store the majority one.
*/

// * Return the element which occurence is more than half of the array size i.e., (arr.length / 2).

public class Moore_Voting_Algorithm {
    public static void main(String args[]){
        int arr[] = {3,1,3,3,2};

        int element = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            if(count == 0)
                element = arr[i];

            if(element == arr[i])
                count++;

            else    // if(element != arr[i])
                count--;
        }

        // element variable will hold the element which has maximum occurence in the array.
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element)
                count++;
        }

        if(count > (arr.length / 2))
            System.out.println("Element: "+element);
        else
            System.out.println("No element has occurence greater than half the size of an array.");
    }
}

// * Time Complexity: O(N+N)
/*The first O(N) is to calculate the count and find the expected majority element.
The second one is to check if the expected element is the majority one or not.
Note: If the question states that the array must contain a majority element, in that case, we do not need the second check.
Then the time complexity will boil down to O(N).*/

// * Space Complexity: O(1)

