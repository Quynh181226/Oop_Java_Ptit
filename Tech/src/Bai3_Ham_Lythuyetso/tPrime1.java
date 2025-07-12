package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

public class tPrime1 {
    //Cthuc phan tich thua so ngto
    //n=p1^l1*p2^l2...pk^lk
    //60=2^2*3^1*5^1
    //
    //Bài 8. T-prime
    //Cho số tự nhiên N. Nhiệm vụ của bạn là hãy liệt kê tất cả các số có đúng ba ước
    //số không vượt quá n. Ví dụ n=100, ta có các số 4, 9, 25, 49.
    //Input Format: Số nguyên dương N
    //Constraints: 1≤N≤10^12 //Code can than ko se bi chay qua thoi gian
    //Output Format: Đưa ra kết quả trên một dòng
    //Sample Input: 100
    //Sample Output: 4 9 25 49
    public static boolean nguyenTo(int n){
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
        long n=sc.nextLong();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(nguyenTo(i)){
                //ep kieu theo cach 1
                System.out.print(1l*i*i+" ");
                //ep kieu theo cach 2
                System.out.print((long)i*i*i+" ");
            }
        }
    }
    //xem lai chua hieu : giai thich chi tiet code nhat la dong cuoi cung chua hieu de lam gi
}
