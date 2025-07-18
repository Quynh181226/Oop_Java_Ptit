package Bai1_Ctruc_re_nhanh;

import java.util.Scanner;

public class khoangCachEuclid {
    // Bài 5. Khoảng cách Euclid.
    //Có nhiều khoảng cách giữa 2 điểm trong hệ tọa độ ví dụ như khoảng cách Manhattan, Euclid, Minkowski.
    //Nhưng trong chương trình toán phổ thông các bạn sử dụng nhiều nhất là khoảng cách Euclid.
    //Vì vậy bạn hãy tính khoảng cách Euclid giữa 2 điểm trong hệ tọa độ Oxy
    //Input Format
    //Tọa độ của 2 điểm (x1, y1) và (x2, y2) là các số nguyên
    //Constraints
    //-10^6≤xi,yi≤10^6
    //Output Format
    //In ra khoảng cách giữa 2 điểm, lấy độ chính xác 2 số sau dấu phẩy.
    //Sample Input 0
    //1 4 4 8
    //Sample Output 0
    //5.00
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("%.2f\n",distance);
    }
}
