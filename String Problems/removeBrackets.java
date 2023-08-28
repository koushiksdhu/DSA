/* Write a program to remove brackets from an algebraic expression
Given an algebraic expression, we need to simplify the expression and remove the brackets.
*/

import java.util.*;

public class removeBrackets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the algebraic expression: ");
        String exp = sc.nextLine();

        for(int i = 0; i < exp.length(); i++){
            if(exp.charAt(i) == '(' || exp.charAt(i) == ')'){   
                exp = exp.substring(0, i) + exp.substring(i+1, exp.length());
                i--;
            }
        }
        
        System.out.println("Expression: "+exp);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)
