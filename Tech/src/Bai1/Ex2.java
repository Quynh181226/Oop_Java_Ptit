package Bai1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Nam nhuan la nam chia het cho 400 or (chia het cho 4 va khong chia het cho 100
//        Nhap vao N la 1 nam va ktra xem N co phai nam nhuan hay khong

//        Input: So nguyen duong N
//        Constraints: 1<=N<=5000
//        Output: In ra YES neu la nam nhuan nguoc lai in ra NO Sample

//        Input: 2020
//        Output: YES
        int n=sc.nextInt();
        if((n%400==0)||(n%4==0 && n%100!=0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
