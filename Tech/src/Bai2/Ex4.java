package Bai2;

import java.util.Scanner;

public class Ex4 {
    // Bài 17. Tính tổng chữ số của N
    //Nhập vào n, tính tổng các chữ số của n, và in ra kết quả
    //Input Format
    //Số nguyên "không âm" n
    //Constraints
    //0≤n≤10^18
    //Output Format
    //Tổng chữ số của n
    //Sample Input 0
    //12341
    //Sample Output 0
    //11
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int sum=0;
            while(n!=0){
//                C1
                int m = (int) (n % 10); // Lấy chữ số cuối cùng của n
                sum = sum + m;//Cộng vào tổng
//              sum+=m;
//                C2
//                sum += (n % 10);
                n/=10;
            }
        System.out.println(sum);
    }
}
