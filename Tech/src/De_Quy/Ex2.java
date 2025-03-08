package De_Quy;

import java.util.Scanner;

public class Ex2 {
        // Bài 2. Tính tổng 2.
        //Tính tổng hàm S(n) = 1^2 + 2^2 + 3^2 + 4^2 + .. + n^2 bằng đệ quy.
        //Nếu bạn chưa biết thì S(n) có thể tính nhanh bằng
        //công thức S(n) = n * (n + 1) * (2n + 1) / 6
        //Input Format: Số nguyên dương n.
        //Constraints :0≤n≤1000; Chú ý các bạn phải code bằng đệ quy nhé.
        //Output Format: In ra kết quả của S(n)
        //Sample Input: 53
        //Sample Output: 51039
        public static long remain(long n){
            if(n==1){
                return 1;
            }else{
                return n*n+remain(n-1);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long sum = remain(n);
            System.out.println(sum);
        }
        //Chua hieu bai
}
