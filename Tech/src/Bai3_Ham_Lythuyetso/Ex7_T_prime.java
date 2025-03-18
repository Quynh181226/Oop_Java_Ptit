package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

//Bài 8. T-prime
//Cho số tự nhiên N. Nhiệm vụ của bạn là hãy liệt kê tất cả các số có đúng ba ước
//số không vượt quá n. Ví dụ n=100, ta có các số 4, 9, 25, 49.
//Input Format
//Số nguyên dương N
//Constraints
//1≤N≤10^12 : Vi n qua lon neu duyet vòng for bthg thi se qua tgian
//Output Format
//Đưa ra kết quả trên một dòng
//Sample Input 0
//        100
//Sample Output 0
//        4 9 25 49
public class Ex7_T_prime {
    public static boolean ngTo(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(ngTo(i)){
                System.out.print((1L * i * i) + " ");
            }
        }
    }
}
