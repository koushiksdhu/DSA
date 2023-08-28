/* Given the radius of the circle, calculate the area of the circle.

Example 1:
Input: N = 5
Output: 78.5
Explanation: Using formula  πr2 for finding area of circle we get area as 78.5

Example 2:
Input: N = 4
Output: 50.2
Explanation: Using formula  πr2 for finding area of circle we get area as 50.2
*/

import java.util.*;

public class areaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();

        float area = r * r * 22 / 7;

        System.out.println("Area of a Circle is: "+area);
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)