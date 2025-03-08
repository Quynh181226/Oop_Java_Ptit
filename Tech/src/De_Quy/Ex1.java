package De_Quy;
//De quy la 1 ky thuat lap trinh
//-> 1 ham tu goi lai chinh no vs 1 dau vao nho hon
//Cho den khi dat den 1 dieu kien dung

import java.util.Scanner;

public class Ex1 {
    public static int S(int n){
        if(n==0){
            return 0;
            //Dkien dung of de quy
        }else{
            //Neu n>0 -> Goi de quy vs n-1 de tinh tong
            //Goi lai chinh no
            return n+S(n-1);
            //eg: S(4) = 4 + S(3)
            //     = 4 + (3 + S(2))
            //     = 4 + (3 + (2 + S(1)))
            //     = 4 + (3 + (2 + (1 + S(0))))
            //     = 4 + 3 + 2 + 1 + 0
            //     = 10
            //Cu the hon : S(4) = 4 + S(3)
            //S(3) = 3 + S(2)
            //S(2) = 2 + S(1)
            //S(1) = 1 + S(0)
            //S(0) = 0
            //S(1) = 1 + S(0) = 1 + 0 = 1
            //S(2) = 2 + S(1) = 2 + 1 = 3
            //S(3) = 3 + S(2) = 3 + 3 = 6
            //S(4) = 4 + S(3) = 4 + 6 = 10
            //-> Goi -> Quay nguoc lai -> tinh
        }
    }
    public static void main(String[] args) {
        //Bài 1. Tính tổng 1.
        //Tính tổng hàm S(n) = 1 + 2 + 3 + 4 + .. + n bằng đệ quy.
        //Nếu bạn chưa biết thì S(n) có thể tính nhanh bằng
        //công thức S(n) = n * (n + 1) / 2
        //Input Format: Số nguyên dương n.
        //Constraints: 0≤n≤1000;
        //Chú ý các bạn phải code bằng đệ quy nhé.
        //Output Format: In ra S(n).
        //Sample Input: 773
        //Sample Output: 299151
        Scanner sc = new Scanner(System.in);
        //Cho nguoi dung nhap so n vao ban phim de tinh tong
//        int n = sc.nextInt();
//        System.out.println(S(n));
        //Dung de quy
        //Cho san so mac dinh mau la 4
        System.out.println(S(4));
        //Dung cthuc
        //System.out.println(n*(n+1)/2);
    }
    //Chua hieu bai
}
