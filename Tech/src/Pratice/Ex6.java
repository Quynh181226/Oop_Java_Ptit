package Pratice;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Bài 7: Chữ số cuối cùng và 2 chữ số cuối cùng
        //Cho số nguyên dương N, bạn hãy sử dụng phép chia dư để lấy ra:
        //1 chữ số cuối cùng của N
        //2 chữ số cuối cùng của N
        //Lưu ý chọn kiểu dữ liệu của N cho phù hợp
        //Input Format: 1 dòng duy nhất chứa số nguyên dương N
        //Constraints: 100<=N<=10^18
        //Output Format:
        //Dòng 1 in ra chữ số cuối cùng
        //Dòng 2 in ra 2 chữ số cuối cùng
        //Sample Input 0: 1234
        //Sample Output 0:
        //4
        //34
        Scanner input = new Scanner(System.in);
        long n=input.nextLong();
        System.out.println(n % 10 + "\n" + n % 100);
    }
}
