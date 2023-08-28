/* SPIRAL MATRIX:
    Enter the size: 3
    1 2 3
    8 9 4
    7 6 5
*/

/*
 * Printing a matrix in spiral form is the same as peeling an onion layer by layer.
 * Because we are printing the elements layer by layer starting from the outer layers.
 
 * In this approach, we will be using four loops to print all four sides of the matrix.
        * 1st loop: This will print the elements from left to right.
        * 2nd loop: This will print the elements from top to bottom.
        * 3rd loop: This will print the elements from right to left.
        * 4th loop: This will print the elements from bottom to top. 

STEPS:

* Create and initialize variables top as starting row index, bottom as ending row index left
* as starting column index, and right as ending column index. As shown in the image given below.
* In each outer loop traversal print the elements of a square in a clockwise manner.
* Print the top row, i.e. Print the elements of the top row from column index left to right and increase the count of the top so that
* it will move to the next row.
* Print the right column, i.e. Print the rightmost column from row index top to bottom and decrease the count of right.
* Print the bottom row, i.e. if top <= bottom, then print the elements of a bottom row from column right to left and decrease
* the count of bottom
* Print the left column, i.e. if left <= right, then print the elements of the left column from the bottom row to the top row and
* increase the count of left.
* Run a loop until all the squares of loops are printed.

NOTE:

As we can see in the code snippet below, two edge conditions are being added in the last two ‘for’ loops: when we are moving from
right to left and from bottom to top. 
These conditions are added to check if the matrix is a single column or a single row. So, whenever the elements in a single row are
traversed they cannot be traversed again backward so the condition is checked in the right-to-left loop. When a single column is
present, the condition is checked in the bottom-to-top loop as elements from bottom to top cannot be traversed again.
*/

import java.util.*;
public class spiralMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;

        int count = 1;

        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++)
                matrix[top][i] = count++;
            top++;

            for(int i = top; i <= bottom; i++)
                matrix[i][right] = count++;
            right--;

            if(top <= bottom){      //These conditions are added to check if the matrix is a single column or a single row.
                for(int i = right; i >= left; i--)
                    matrix[bottom][i] = count++;
                bottom--;
            }

            if(left <= right)       //These conditions are added to check if the matrix is a single column or a single row.
                for(int i = bottom; i >= top; i--)
                    matrix[i][left] = count++;
                left++;
        }

        // Printing the 2D Matrix:
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Time Complexity: O(N*M)
// Space Complexity: O(N*M)

