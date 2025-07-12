package Bai2_Vonglap;

import java.util.Scanner;

public class demSoLuongChuSoCuaN {
    //Bài 16. Đếm số lượng chữ số của N
    //Nhập vào n, đếm số lượng chữ số của n và in ra kết quả.
    //Input Format
    //Số nguyên "không âm" n
    //Constraints
    //0≤n≤10^18
    //Output Format
    //Số lượng chữ số của n
    //Sample Input 0
    //123456789
    //Sample Output 0
    //9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        if(n==0){
            System.out.println("1");
        }else {
            while(n!=0){
                n/=10;
                count++;
            }
            System.out.println(count);
        }
    }
}
