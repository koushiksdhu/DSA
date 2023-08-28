import java.util.*;

public class nDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Number: ");
        nDigit(n);
    }
    static void nDigit(int n){
        if(n > 0){
            nDigit(n-1);
            System.out.print(n+" ");
        }
    }
}
