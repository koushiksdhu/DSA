import java.util.*;

public class combination{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.print("Enter the value of r: ");
		int r = sc.nextInt();
		double comb = fact(n)/(fact(r)*fact(n-r));
		System.out.println("Combination (By Traditional Method): "+comb);	
		System.out.println("Combination (By Modern Method): "+comb(n, r));	
	}
	static int fact(int n){
		if(n == 0)
			return 1;
		return n*fact(n-1);
	}

	static int comb(int n, int r){
		if(n == r || r == 0)
			return 1;
		return comb(n-1, r-1)+comb(n-1, r);
	}
}