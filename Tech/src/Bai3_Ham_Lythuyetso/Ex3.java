package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

public class Ex3 {
    public static boolean fibo(long n){
        if(n==0||n==1){
            return true;
        }
        long fn1=1, fn2=0;
        for(int i=2;i<=92;i++){
            long fn=fn1+fn2;
            if(fn==n) {
                return true;
            }
            fn2=fn1;
            fn1=fn;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //truyen san gtri can ktra
        System.out.println(fibo(2));
        //ktra = cach nhap
        long num=sc.nextLong();
        System.out.println(num+" "+"Number Fibonacci ???"+" "+fibo(num));
    }
}
