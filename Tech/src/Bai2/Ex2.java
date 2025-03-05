package Bai2;

import java.util.Scanner;
//demo vong lap
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=12345;
        int count=0;
        while(n!=0){
            ++count;
            n/=10;
            //neu 1 so nguyen chia cho 10 thi se mat di hang don vi
        }
        System.out.print(count);
    }
}
