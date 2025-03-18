package Bai2_Vonglap;

import java.util.Scanner;
//CHUA OKKK HELPPPP
//Bài 36. Hình thoi
//Cho số nguyên dương N, in ra hình thoi tương ứng
//Input Format
//Dòng duy nhất chứa số nguyên dương N
//Constraints
//1<=N<=20
//Output Format
//In ra hình tương ứng
//Sample Input 0
//        5
//Sample Output 0
//               *
//             * * *
//           * * * * *
//         * * * * * * *
//        * * * * * * * * *
//          * * * * * * *
//           * * * * *
//             * * *
//               *
//Ptich Bài toán: In hình thoi
//Input: Số nguyên dương N (1 ≤ N ≤ 20).
//Output: Hình thoi với chiều cao là 2N - 1 dòng, trong đó:
//Phần trên: Tăng dần số lượng dấu * từ 1 đến 2N - 1.
//Phần dưới: Giảm dần số lượng dấu * từ 2N - 3 về 1.
//Ví dụ: Với N = 5, hình thoi có 9 dòng (2 * 5 - 1 = 9), như trong Sample Output.
public class Hinh_thoi {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<1||n>20){
        sc.close();
        return;
    }
    for(int i=1;i<=n*2-1;i++){
        for(int j=1;j<=n*2-1;j++){
            if(i<=n){
                if((j>=n-(i-1))&&j<=n+(i-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }else{
                if((j>=i-n+1)&&(j<=2*n-1-(i-n))){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        }
        System.out.println("");
    }
    sc.close();
}
}
//Phân tích cách giải:
//1. Hiểu cấu trúc hình thoi:
//Hình thoi là một hình đối xứng:
//Phần trên: Từ dòng 1 đến dòng N, số dấu * tăng dần: 1, 3, 5, ..., 2N - 1.
//Phần dưới: Từ dòng N + 1 đến dòng 2N - 1, số dấu * giảm dần: 2N - 3, 2N - 5, ..., 1.
//Tổng số dòng = 2N - 1.
//Mỗi dòng có độ dài tối đa là 2N - 1 cột (tính cả dấu cách).
//Ví dụ với N = 5:
//    *        // 1 sao
//  * * *      // 3 sao
//* * * * *    // 5 sao
//* * * * * * * // 7 sao
//* * * * * * * * // 9 sao (đỉnh)
//* * * * * * * // 7 sao
//* * * * *    // 5 sao
//  * * *      // 3 sao
//    *        // 1 sao
//2. Cách tiếp cận:
//Dùng 2 vòng lặp lồng nhau:
//Vòng ngoài (i): Duyệt qua các dòng (1 đến 2N - 1).
//Vòng trong (j): Duyệt qua các cột (1 đến 2N - 1).
//Quyết định in * hoặc dựa trên vị trí (i, j):
//Phần trên (i ≤ N): Xác định phạm vi cột chứa * tăng dần.
//Phần dưới (i > N): Xác định phạm vi cột chứa * giảm dần.
//3. Quy luật in dấu *:
//Phần trên:
//Dòng i = 1: * ở cột N.
//Dòng i = 2: * từ cột N-1 đến N+1.
//Dòng i = 3: * từ cột N-2 đến N+2.
//Quy luật: Từ N - (i - 1) đến N + (i - 1).
//Phần dưới:
//Dòng i = N+1: * từ cột 2 đến 2N-2.
//Dòng i = N+2: * từ cột 3 đến 2N-3.
//Quy luật: Từ i - N + 1 đến 2N - 1 - (i - N).
//Giải thích logic code:
//1. Vòng lặp ngoài:
//for (int i = 1; i <= n * 2 - 1; i++)
//i là số dòng, chạy từ 1 đến 2N - 1.
//Với N = 5, i chạy từ 1 đến 9 (9 dòng).
//for (int j = 1; j <= n * 2 - 1; j++)
//j là số cột, cũng chạy từ 1 đến 2N - 1.
//Với N = 5, mỗi dòng có 9 vị trí (tính cả khoảng trắng).
//3. Điều kiện phân chia phần trên/dưới:
//if (i <= n) {
//    // Phần trên
//} else {
//    // Phần dưới
//}
//i <= N: Xử lý nửa trên (tăng dần).
//i > N: Xử lý nửa dưới (giảm dần).
//4. Phần trên (i <= n):
//if ((j >= n - (i - 1)) && j <= n + (i - 1)) {
//    System.out.print("* ");
//} else {
//    System.out.print("  ");
//}
//Quy luật:
//Cột bắt đầu: N - (i - 1) (giảm dần khi i tăng).
//Cột kết thúc: N + (i - 1) (tăng dần khi i tăng).
//Ví dụ với N = 5:
//i = 1: j từ 5-0=5 đến 5+0=5 → * ở cột 5.
//i = 2: j từ 5-1=4 đến 5+1=6 → * ở cột 4, 5, 6.
//i = 3: j từ 5-2=3 đến 5+2=7 → * ở cột 3, 4, 5, 6, 7.
//Số * = 2i - 1.
//5. Phần dưới (i > n):
//if ((j >= i - n + 1) && (j <= 2 * n - 1 - (i - n))) {
//    System.out.print("* ");
//} else {
//    System.out.print("  ");
//}
//Quy luật:
//Cột bắt đầu: i - N + 1 (tăng dần khi i tăng).
//Cột kết thúc: 2N - 1 - (i - N) (giảm dần khi i tăng).
//Ví dụ với N = 5:
//i = 6: j từ 6-5+1=2 đến 9-(6-5)=8 → * ở cột 2-8 (7 sao).
//i = 7: j từ 7-5+1=3 đến 9-(7-5)=7 → * ở cột 3-7 (5 sao).
//i = 8: j từ 8-5+1=4 đến 9-(8-5)=6 → * ở cột 4-6 (3 sao).
//i = 9: j từ 9-5+1=5 đến 9-(9-5)=5 → * ở cột 5 (1 sao).
//6. In xuống dòng:
//System.out.println("");
//Sau mỗi dòng, xuống dòng để sang dòng mới.
//Luồng xử lý:
//Nhập N từ người dùng.
//Duyệt qua từng dòng (i từ 1 đến 2N - 1):
//Duyệt qua từng cột (j từ 1 đến 2N - 1).
//Nếu i ≤ N:
//Tính phạm vi cột chứa * cho phần trên.
//In * hoặc .
//Nếu i > N:
//Tính phạm vi cột chứa * cho phần dưới.
//In * hoặc .
//Xuống dòng sau mỗi i.
//Kết thúc khi i = 2N - 1.
//Tư duy giải các bài vẽ hình:
//Phân tích hình học:
//Xác định số dòng, số cột tối đa.
//Tìm tính đối xứng (nếu có).
//Đếm số ký tự đặc biệt (*) trên mỗi dòng.
//Xác định quy luật:
//Tìm mối quan hệ giữa chỉ số dòng (i) và số lượng/vị trí ký tự.
//Chia hình thành các phần (trên, dưới, trái, phải) nếu cần.
//Dùng vòng lặp:
//Vòng ngoài: Điều khiển dòng.
//Vòng trong: Điều khiển cột.
//Điều kiện if để quyết định in ký tự hay khoảng trắng.
//Kiểm tra thủ công:
//Với N nhỏ (1, 2, 3), vẽ tay để tìm quy luật.
//Ví dụ N = 2:
//*      // i=1: 1 sao
/// / i=2: 3 sao
/// / i=3: 1 sao
//Tối ưu:
//Nếu hình phức tạp, có thể tách logic phần trên/dưới thành hàm riêng.
//Dùng biến phụ để tính toán vị trí.