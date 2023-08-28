import java.util.*;

public class nDigitsInReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Reverse: ");
        nDigit(n);
    }
    static void nDigit(int n){
        if(n <= 0)
            return;
        System.out.print(n+" ");
        nDigit(n-1);
    }
}

// Time Complexity: O(N).
// Space Complexity: O(1). (No Extra space is been used explicitly but Internally stack space is used)