package Bai2_Vonglap;

import java.util.Scanner;

public class veHinh1 {
    public static void main(String[] args) {
        //Bài 21. Vẽ hình 1
        //Nhập n là một số nguyên không quá 100. In ra các hình tương ứng, mỗi hình cách nhau một dòng trống.
        //Input Format
        //Số nguyên dương N
        //Constraints
        //1≤n≤100
        //Output Format
        //In ra hình sao theo mẫu
        //DE LAM DUOC DANG BAI NHU THE NAY TA PHAI XAC DINH DUOC NO LAP BAO NHIEU LAN &&&&&
        //VA NO CO BAO NHIEU DONG &&&&&
        //Sample Input :
        //5
        //Sample Output:
        /* ***** i=1
           *****   i=2
           *****   i=3
           *****   i=4
           *****   i=5*/
        Scanner sc = new Scanner(System.in);
        int n=5;
        //vong for de lap n dong
        //i la chi so hang
        //j la chi so cot
        for(int i=1;i<=n;i++){
            System.out.println("dong tuong ung voi i="+i+":");
            //vong for tiep theo de xay dung tung dong 1
            //xem dong day xay dung nhu the nao tim quy luat cua no
            //=> n.vu in 5 dau sao la cua vong for con thuc hien
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //*****
        //*   *
        //*   *
        //*   *
        //*****
        //
        //*****
        //*###*
        //*###*
        //*###*
        //*****
        //
        //1 1 1 1 1
        //2       2
        //3       3
        //4       4
        //5 5 5 5 5
    }
}
