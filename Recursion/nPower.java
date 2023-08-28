import java.util.*;

public class nPower{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");	
		int m = sc.nextInt();
		System.out.print("Enter the base: ");
		int n = sc.nextInt();
		System.out.println("Power: "+power(m, n));

	}

	static int power(int m, int n){
		if(n == 1)
			return m;
		return m*power(m, n-1);
	}
}

// Time Complexity: O(N)