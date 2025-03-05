package Bai1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //Ktra n>=10 and n<=20
        //Neu dung in ra Yes, sai in ra No
        //C1
//        if(n>=10&&n<=20){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
        //C2
        if(n>=10){
            if(n<=20){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
