package Pratice;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Cho 4 số x, y, z, t là số nguyên được nhập từ bàn phím. Bạn hãy in ra 3 dòng:
        //Dòng 1 lần lượt là 4 số x, y, z, t. Mỗi số cách nhau bằng một dấu phẩy
        //Dòng 2 in ra tổng 4 số
        //Dòng 3 in ra giá trị của biểu thức x - y + z * t
        //Input Format
        //8 3 12 5
        //Constraints
        //chú ý giá trị của biểu thức x - y + z * t có thể tràn kiểu dữ liệu int
        //Output Format
        //8,3,12,5
        //28
        //65
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(x + "," + y + "," + z +","+t);
        System.out.println((long)x+y+z+t);
        System.out.println(x-y+(long)z*t);
        //tại sao phải ép kiểu trg trg hop nay, trg hop nao thi phai ep kiêu

    }
}
