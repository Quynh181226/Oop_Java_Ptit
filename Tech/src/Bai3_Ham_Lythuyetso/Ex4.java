package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

public class Ex4 {
    //Fibonacci 3
    //Nhiệm vụ của bạn là hãy tìm số thuộc dãy số Fibonacci nhỏ nhất lớn hơn hoặc
    //bằng số N đã cho. Biết một số đầu tiên trong dãy Fibonacci là : 1, 1, 2, 3, 5, 8, 13....
    //Input Format: Dòng duy nhất chứa số nguyên dương N
    //Constraints: 1<=N<=10^18
    //Output Format: In ra số Fibonacci nhỏ nhất lớn hơn hoặc bằng N
    //Sample Input: 12
    //Sample Output: 13
    //=> n(min)>=n da cho
    public static long fibo(long n){
        if(n==1) return 1;
        long fn1=1, fn2=1;//???
        for(int i=3; i<=92; i++){
            long fn=fn1+fn2;
            if(fn>=n) return fn;
            fn2=fn1;
            fn1=fn;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextLong();
        System.out.print(fibo(n));
    }
    //can xem lai vi chua hieu
}
