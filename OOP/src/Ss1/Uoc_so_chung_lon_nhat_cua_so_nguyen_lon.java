package Ss1;
import java.math.BigInteger;
import java.util.Scanner;
public class Uoc_so_chung_lon_nhat_cua_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.gcd(b));
        }
    }
}




