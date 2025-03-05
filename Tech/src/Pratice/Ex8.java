package Pratice;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //Cho số nguyên dương N có ít nhất 5 chữ số.
        //Nhiệm vụ của bạn là xóa đi 3 chữ số cuối cùng của N
        //và in ra những chữ số còn lại.
        //Ví dụ N = 12345 sau khi xóa đi 3 chữ số cuối cùng thì N = 12.
        //Gợi ý: đối với phép chia nguyên nếu bạn muốn xóa đi 1 chữ số cuối cùng
        //chỉ cần lấy N chia nguyên cho 10, ví dụ N = 12345 / 10 = 1234,
        //tương tự N = 12345 / 100 = 123, N = 12345 / 1000 = 12
        //Input Format: Dòng duy nhất chứa số nguyên dương N
        //Constraints: 10000<=N<=10^18
        //Output Format: In ra N sau khi xóa đi 3 chữ số cuối cùng
        //Sample Input 0: 9816374
        //Sample Output 0: 9816
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(n/1000);//xoa di 3 so cuoi
        System.out.println(n%1000);//xoa di 3 so dau
    }
}
