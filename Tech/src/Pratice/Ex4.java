package Pratice;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //Cho số nguyên dương N, nhiệm vụ của bạn là tính căn bậc 2 và căn bậc 3 của N.
        //Input Format: Dòng duy nhất chứa số nguyên dương N
        //Constraints: 1<=N<=10^9;
        //Output Format: Dòng 1 in ra căn bậc 2 của N với 2 số sau dấu phẩy
        //Dòng 2 in ra căn bậc 3 của N với 3 số sau dấu phẩy
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f", Math.sqrt(n));
        System.out.println("");
        System.out.printf("%.3f", Math.cbrt(n));
    }
}
