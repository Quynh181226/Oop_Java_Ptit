package Bai1_Ctruc_re_nhanh;

import java.util.Scanner;

public class in {
    public static void main(String[] args) {
//        char kiTu = 'A';
//        System.out.println("Ký tự: " + kiTu);
        //Input: 1 số nguyên x và in ra 3 dòng
        //Constraints:1<=a<=1000
        //Output:
        //Dong 1 : so x bn vua nhap tu ban phim
        //Dong 2: in ra dong chu "Hello Word"
        //Dong 3: in ra "Java programming"
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&&a<=1000){
            System.out.println(a);
            System.out.println("Hello Word");
            System.out.println("Java programming");
        }
    }
}
