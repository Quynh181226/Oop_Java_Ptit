package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

public class Ex1 {
    //UCLN
    public static int gcd(int a,int b){
        //lap den khi khac 0
        //=0 -> tim dc ucln
        //eg: gcd(20, 16)
        //gcd(16, 4)
        //gcd(4, 0)
        //do phuc tap log N
        while(b!=0){
            //Dong nay de hieu duoc qtrinh bien doi cua no: Dong nay chi de test
            System.out.println(a+" "+b);
            //
            int remain=a%b;
            a=b;
            b=remain;
        }
        return a;
    }
    //BCNN : a*b/(gcd(a,b)
    public static int lcm(int a, int b){
        return a/gcd(a, b)*b;
    }
    public static void main(String[] args) {
        //UCLN - BCNN
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
