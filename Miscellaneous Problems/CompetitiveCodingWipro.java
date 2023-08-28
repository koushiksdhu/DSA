/*
Detective Buckshee junior has been approached by the shantiniketan kids society for help in finding the password to the games
complex. After hearing the scenario, detective Buckshee junior realizes that he will need a programmers support.
He contacts you and requests your help.
Please help the detective by writing a function to generate the password.

The scenario is as below:-
Five numbers are available with the kids.
These numbers are either stable or unstable.
A number is STABLE if each of its digit occur the same number of times. i.e the
frequency of each digit in the number is the same. For e.g. 2277, 4004, 11, 23, 583835, 1010 are examples of stable numbers.

Similarly, A number is UNSTABLE if the frequency of the each digit in the number is
NOT the same, For e.g 221, 4314, 101, 233, 58135, 101 are examples of unstable numbers.

The password can be found as below:-
i.e. Password=sum of all unstable numbers.

For Example: if input1=12, input2=1313, input3=122, input4=676, and
input5=898,
stable numbers are 12, 1313 and 678
unstable numbers are 122 and 898
So, the password should be=sum of all unstable numbers=1020
*/

import java.util.*;

public class CompetitiveCodingWipro {
    public static void main(String args[]){
        int n1 = 12;
        int n2 = 1313;
        int n3 = 122;
        int n4 = 678;
        int n5 = 898;

        int sum = password(n1) + password(n2) + password(n3) + password(n4) + password(n5);
        System.out.println("Password: "+sum);
    }
    static int password(int n){
        int arr[] = new int[10];
        int temp = n;
        int max = Integer.MIN_VALUE;
        while(temp != 0){
            arr[temp%10]++;
            max = Math.max(max, arr[temp%10]);
            temp/=10;
        }
        for(int i = 0; i < arr.length ;i++){
            if(arr[i] != 0 && arr[i] != max)
                return n;
        }
        return 0;
    }
}   
