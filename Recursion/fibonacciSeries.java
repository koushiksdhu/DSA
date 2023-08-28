import java.util.*;

public class fibonacciSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Number: "+fibo(n));
	}
	static int fibo(int n){
		if(n <= 1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
}

// Time Complexity: O(N)