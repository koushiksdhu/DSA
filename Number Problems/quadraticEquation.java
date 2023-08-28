/* Program to Find Roots of a quadratic equation
The standard form of a quadratic equation is: ax2 + bx + c = 0, where a, b and c are real numbers and a != 0
You have given a, b, c of the equation, you have found the roots of the equation.

For finding out the roots of the equation we have to find the discriminant of the equation, which tells the nature of the roots.
Then use the formula of finding the roots.

> Find discriminant of the equation.
> Discriminant(D) = b^2 – 4*a*c
> If the discriminant is greater than 0, the roots are real and different.
> If the discriminant is equal to 0, the roots are real and equal.
> If the discriminant is less than 0, the roots are complex and different.

Example 1:
Input: a = 1, b = -3, c = -10
Output: Roots are real and different, i.e(5 , -2).

Example2:
Input: a = 1, b = 1, c = 1
Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732).
*/

import java.util.*;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the value of a: ");
        double a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        double b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        double c = sc.nextInt();

        double d = b * b - 4 * a * c;
        double sqr = Math.sqrt(Math.abs(d));

        if(d > 0){                                                  // Roots are real and different.
            System.out.println("Roots are real and different.");
            double root1 = (-b + sqr) / 2 * a;
            double root2 = (-b - sqr) / 2 * a;
            System.out.println("Roots are: "+root1+", "+root2);
        }

        else if(d == 0){                                            // Roots are real and same.
            System.out.println("Roots are real and same.");
            System.out.println("Roots are: "+(-b/(2*a))+", "+(-b/(2*a)));
        }

        else if(d < 0){                                             // Roots are complex.
            System.out.println("Roots are complex.");
            System.out.println("Roots are: "+(-b / (2 * a))+" + i, "+(-b / (2 * a))+" - i");
        }
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)
