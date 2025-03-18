package Bai1_Ctruc_re_nhanh;
//Cho 1 so nguyen khong am N
//Ban hay thuc hien viet cau lenh de ktra cac dieu kien sau
//...1-10...
//Input: So nguyen duong n
//Constraints:1<=n<=10^6
//Output: In ra 10 dong, moi dong la YES or NO tuong ung voi 10 dkien
//Neu n tman dkien thu i thi dong i in ra YES vice versa in ra NO

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
// 1. N co phai la so chan
        if(n%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 2. N co phai la so vua chia het cho 3 vua chia het cho 5
        if(n%3==0 && n%5==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 3. N co phai la so chia het cho 3 nhung khong chia het cho 7
        if(n%3==0 && n%7!=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 4. N co phai la so chia het cho 3 or 7
        if(n%3==0 || n%7==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 5. N la so lon hon 30 va nho hon 50
        if(n>30 && n<50){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 6. N co phai la so khong nho hon 30 va chia het it nhat cho 1 trg 3 so 2, 3, 5
        if(n>=30 && (n%2==0 || n%3==0 || n%5==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 7. N co phai la so co 2 chu so tan cung la 1 so nguyen to
        //N phải có hai chữ số → tức là 10 ≤ N ≤ 99
        //Chữ số tận cùng của N phải là một số nguyên tố (2, 3, 5, 7)
        int unit= n % 10;
        if((n>=10 && n<=99) && (unit==2  || unit==3 || unit==5 || unit==7)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 8. N co phai la so khong vuot qua 100 va chia het cho 23
        if(n<100 && n%23==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 9. N khong thuoc doan [10,20]
        if(n<10 || n>20){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
// 10. N co chu so tan cung la boi so cua 3
        // Bội số của 3 là các số chia hết cho 3, tức là:
        //0, 3, 6, 9, 12, 15, ...
        if(unit%3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
