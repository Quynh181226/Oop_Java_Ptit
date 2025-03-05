package Bai1;

import java.util.Scanner;

public class Ex7 {
    // Quảng trường Nhà hát ở thủ đô Berland có hình chữ nhật với kích thước n x m mét.
    // Nhân dịp kỷ niệm thành phố, một quyết định đã được đưa ra để lát Quảng trường
    // bằng những viên bằng đá granit vuông. Mỗi viên đá hình vuông có kích thước a * a.
    // Số lượng viên đá ít nhất cần thiết để lát Quảng trường là bao nhiêu?
    // Nó được phép che phủ bề mặt lớn hơn Quảng trường Nhà hát.
    // Nó không được phép phá vỡ các viên đá.
    // Các cạnh của viên đá phải song song với các cạnh của Quảng trường.
    //Input: 3 so nguyen duong n, m, a
    //Constraints: 1<=n, m, a<=10^9
    //Output: viet so luong vien da can thiet ke de lat kin quang truong
    //Sample Input:
    // 6 6 4
    //Sample Output:
    //4
    //=> can co 3 buoc:
    //B1: tinh so hang
    //B2: tinh so cot
    //B3: tinh tong hang va cot de ra duoc
    //Vì:
    //Mỗi hàng có cols viên đá.
    //Có rows hàng
    //ma de tinh duoc row or col:
    //Chiều dài quảng trường là n, mỗi viên đá có kích thước a × a.
    //Ta cần bao nhiêu viên đá để phủ hết chiều dài n?
    //Nếu n chia hết cho a → cần đúng n / a viên.
    //Nếu n không chia hết cho a → cần làm tròn lên (tức là thêm 1 viên đá để phủ kín
    //=> rows or cols = n/a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        //tinh so vien da theo chieu dai va chieu rong
        long rows=(n/a);
        long cols=m/a;
        long total=rows*cols;
        System.out.print(total);
        sc.close();
    }
}
