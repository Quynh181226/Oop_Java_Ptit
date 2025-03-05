package Pratice;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //Trong ngôn ngữ lập trình như C, C++, Java khi bạn sử dụng 2 số nguyên để chia cho nhau
        // thì kết quả của phép chia đó chỉ dữ lại phần nguyên cho dù bạn có để kết quả ở số thực
        // như float hay double. Ví dụ a = 10, b = 3 thì phép chia a / b sẽ có kết quả là 3
        // thay vì 3.3333, để lấy được phần thập phân khi chia 2 số nguyên cho nhau bạn cần thực hiện
        // ép kiểu a hoặc b, hoặc cả 2 và b sang dạng số thực trước khi chia.
        // Ví dụ float c = (float) a / b thì khi đó c = 3.3333

        //Cho 2 số x, y. Nhiệm vụ của bạn là tính thương của x/y sao cho:
        //Lấy phần nguyên của phép chia
        //Lấy phần thập phân của phép chia
        //Input Format: 1 dòng duy nhất chứa lần lượt 2 số nguyên y và x
        //Constraints: 1<=x,y<=1000;
        //Output Format
        //Dòng 1 in ra thương của x/y khi sử dụng phép chia nguyên
        //Dòng 2 in ra thương của x/y khi sử dụng phép chia lấy phần thập phân với độ chính xác 2 số sau dấu phẩy
        //Sample Input: 30 70
        //Sample Output
        //2
        //2.33

        Scanner input = new Scanner(System.in);
        int y=input.nextInt();
        int x=input.nextInt();
        System.out.println(x/y);
//        System.out.println("");//co dong nay neu muon xg dong
        System.out.printf("%.2f", (float)x/y);
    }
}
