/*
 * Print the Kth largest and the Kth smallest element from an array.
 */

// By default, Priority Queue implements Min-Heap.

import java.util.*;
public class PriorityQueueQ{
    public static void main(String args[]){
        int arr[] =  {20, 10, 60, 30, 50, 40};
        int k = 4;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : arr){
            minHeap.add(i);
            maxHeap.add(i);
        }

        System.out.println("Maximum kth element: ");
        int i = k;
        while(!maxHeap.isEmpty() && i-- > 0)
            System.out.print(maxHeap.poll()+" ");

        i = k;
        System.out.println("\nMinimum kth element: ");
        while(!minHeap.isEmpty() && i-- > 0)
            System.out.print(minHeap.poll()+" ");
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)