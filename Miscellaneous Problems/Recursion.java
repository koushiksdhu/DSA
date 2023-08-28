/*
 * Question: 1^2 + 2^2 + 3^2 + 4^2 + ........... + N^2
 */


public class Recursion {
    public static void main(String args[]){
        System.out.println(rec(4));
    }
    static int rec(int n){
        if(n < 1)
            return 0;
        else
            return (n * n) + rec(n - 1);
    }
}
