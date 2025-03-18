package Bai2_Vonglap;

import java.util.Scanner;

//Input Format
//Dòng duy nhất chứa số nguyên dương N
//Constraints
//5<=N<=26
//Output Format
//In ra 7 dòng theo yêu cầu
//Sample Input 0
//5
//Sample Output 0
//1 2 3 4 5
//5 4 3 2 1 0
//0 2 4
//1 3 5
//0 4
//a b c d e
//v w x y z
public class Ex0_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Bài 0.Viết vòng lặp
        //Bài này các bạn sử dụng cả 2 vòng lặp for và while để code.
        //Lượt 1 sử dụng for,
        //lượt 2 dùng while.
        //Cho số tự nhiên N, nhiệm vụ của bạn in ra các dãy số bằng vòng lặp trên từng dòng, mỗi số cách nhau một dấu cách.
        //Dòng 1. In ra các số từ 1 tới n.
//        while(){
//
//        }

        




        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //Dòng 2 in ra các số từ n về 0.
        for(int i=n;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //Dòng 3 in ra các số chẵn nhỏ hơn hoặc bằng n.
        for(int i=0; i<=n;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //Dòng 4 in ra các số lẻ nhỏ hơn hoặc bằng n.
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //Dòng 5 in ra các bội số của 4 nhỏ hơn n.
        //???
        for(int i=0;i<n;i++) {
            if(i%4==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //Dòng 6 in ra N chữ cái in thường đầu tiên.
        for(int i=1;i<=n;i++){
            System.out.print((char)(i +97) + " ");
        }
        System.out.println("");
        //Dòng 7 in ra N chữ cái in thường cuối cùng theo thứ tự tăng dần.
        for(int i=122-n+1;i<122;i++){
            System.out.print((char)i +" ");
        }
        System.out.println("");
        //bai nay dang saii
    }
}
