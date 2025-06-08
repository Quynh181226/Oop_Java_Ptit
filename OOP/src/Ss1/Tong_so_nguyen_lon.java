package Ss1;
import java.math.BigInteger;
import java.util.Scanner;

public class Tong_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            //Nhập 2 số nguyên lớn
            //BigInteger là kiểu dữ liệu của Java để lưu trữ số nguyên lớn
            //To
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b).toString());
        }
    }
}
