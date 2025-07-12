package Pratice;
import java.util.Scanner;
public class Ex10 {

//    Cho một xâu ký tự S chỉ có các chữ cái Tiếng Anh viết thường. Hãy đếm xem có bao nhiêu ký tự chữ cái khác nhau trong S.
//    Input: Có duy nhất một dòng chứa xâu ký tự S, độ dài không quá 100.
//    Output: Ghi ra số ký tự chữ cái khác nhau
//    Ví dụ:
//Input  Output
//banana 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] st = new int[127];
        for (int i = 0; i < s.length(); i++) {
            st[s.charAt(i)]++;
        }

        int res = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            if (st[i] > 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}
