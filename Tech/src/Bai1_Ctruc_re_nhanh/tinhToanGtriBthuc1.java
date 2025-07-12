package Bai1_Ctruc_re_nhanh;

import java.util.Scanner;

public class tinhToanGtriBthuc1 {
    public static void main(String[] args) {
        //Bài 1. Tính toán giá trị của biểu thức
        //Cho biểu thức A(x) = x^3 + 3x^2 + x + 1 Với giá trị của x được nhập từ bàn phím, tính và in ra giá trị của biểu thức trên
        //Input Format
        //Số nguyên x
        //Constraints
        //-10^5≤x≤10^5
        //Output Format
        //In ra kết quả cùa biểu thức
        //Sample Input 0
        //2
        //Sample Output 0
        //23
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long res= 1l * x * x * x + 3l * x * x + x + 1;
        //1L là một số kiểu long, có tác dụng ép kiểu toàn bộ phép nhân thành long.
        //Nếu không có 1L, phép toán x * x * x có thể bị tràn số khi x lớn.
        System.out.println(res);
    }
}
