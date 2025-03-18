package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

//Bài 6. Số thuần nguyên tố
//Một số được coi là thuần nguyên tố nếu nó là số nguyên tố, tất cả các chữ số là
//nguyên tố và tổng chữ số của nó cũng là một số nguyên tố. Bài toán đặt ra là
//đếm xem trong một đoạn giữa hai số nguyên cho trước có bao nhiêu số thuần
//nguyên tố.
//Input Format
//Một dòng hai số nguyên dương tương ứng, cách nhau một khoảng trống.
//Constraints
//Các số đều không vượt quá 9 chữ số.
//Output Format
//Viết ra số lượng các số thuần nguyên tố tương ứng
//Sample Input 0
//2345 6789
//Sample Output 0
//15
public class Ex8_So_thuan_ngto {
    public static boolean ngTo(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean check(int n){
        int sum=0;
        //tach tung chu so cua nó ra va tinh tong
        while(n!=0){
            //tinh tong va check xem so day co phai la so ngto ko
            int res=n%10;
            if(res!=2&&res!=3&&res!=5&&res!=7) return false;
            //khi do no se ko thoa man dkien co tat ca cac chu so la so ngto
            sum+=res;
            n/=10;
            //con neu ma no la so ngto thi mk tinh luon vao bien tong
        }
        //thi sau vong while nay no da tman đkien tat ca cac chu so la so ngto roi thi no moi den dc dong nay
        //h mk chi can check xem sum co phai so ngto hay ko
        return ngTo(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        int count=0;
        //o day ta phai goi ham check trc thi no se chay nhanh hon
        //va ti le dung cua no ... hon
        for(int i = (int) a; i<=b; i++){//ep kieu de dung vong lap for
            //1 LUU Y SIEU TO KHONG LO DE TRANH BUG MA KO BT FIX
            //Do la tai vi de bai y/cau ko qua 9 chu so nen vong for co the ep kieu thanh int de chay may se ko bao loi
            //nhg neu n to hon thi o 2 ham check va ngTo ta nen thay int thanh long va sau do chi can cho long=i thi vong for se chay dung
            if (check(i) && ngTo(i)) {
                ++count;
            }
            }
        System.out.println(count);
    }
}
