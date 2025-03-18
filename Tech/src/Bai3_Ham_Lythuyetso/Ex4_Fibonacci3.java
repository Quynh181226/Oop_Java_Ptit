package Bai3_Ham_Lythuyetso;
//Dãy Fibonacci là một chuỗi số mà mỗi số là tổng của hai số trước nó
//Bắt đầu: F(1) = 1, F(2) = 1.
//Từ đó: F(3) = F(1) + F(2), F(4) = F(2) + F(3), ...
//Kết quả: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
import java.util.Scanner;

public class Ex4_Fibonacci3 {
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
            //Input: 12
            //Quá trình:
            //n = 12.
            //fn2 = 1, fn1 = 1.
            //i = 3: fn = 1 + 1 = 2 (< 12).
            //i = 4: fn = 2 + 1 = 3 (< 12).
            //i = 5: fn = 3 + 2 = 5 (< 12).
            //i = 6: fn = 5 + 3 = 8 (< 12).
            //i = 7: fn = 8 + 5 = 13 (≥ 12) → Trả về 13.
            //Output: 13 → True
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
