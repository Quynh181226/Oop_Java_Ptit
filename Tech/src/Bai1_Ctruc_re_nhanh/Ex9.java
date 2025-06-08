package Bai1_Ctruc_re_nhanh;

import java.util.Scanner;

public class Ex9 {
    //Bài 2. Tính toán giá trị biểu thức 2
    //Yêu cầu: Cho ba số nguyên a , b và c, hãy tính S = a*(b+c)+b*(a+c).
    //Input Format
    //3 số a, b, c trên 1 dòng.
    //Constraints
    //-10^8≤a,b,c≤10^8
    //Output Format
    //In ra giá trị của biểu thức.
    //Sample Input 0
    //1 2 3
    //Sample Output 0
    //13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long gTri = a * (b + c) + b * (a + c);
        System.out.print(gTri);
    }
}
