package Pratice;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cho 2 số x, y. Nhiệm vụ của bạn là tính x ^ y
        //Input Format: 1 dòng chứa 2 số dương x, y viết cách nhau một dấu cách.
        //Constraints: x > 0 y > 0
        //Output Format: In ra x^y, nếu x^y có phần thập phân thì in ra 2 số sau dấu phẩy, nếu không có phần thập phân thì không cần in
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((long)Math.pow(x,y));
    }
}
