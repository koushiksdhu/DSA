// Question: Magic Square:

import java.util.*;

class magicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        generateMagicSquare(sc.nextInt());
    }

    static void generateMagicSquare(int n) {
      if(n % 2 == 0){
        System.out.println("The value of N should be Odd.");
        System.exit(0);
      }

      int arr[][] = new int[n][n];
      int row = 0, col = n / 2;       // col should be mid because element fill should start from mid.
      int nSqr = (int)Math.pow(n, 2);

      for(int i = 1; i <= nSqr; i++) {
        arr[row][col] = i;

        if(i % n == 0)
          row++;
        else {
          row = row == 0 ? n-1 : row-1;
          col = col == n-1 ? 0 : col+1;
        }
      }

    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
    }
}
