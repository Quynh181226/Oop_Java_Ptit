package Bai3_Ham_Lythuyetso;

import java.util.Scanner;
//Chương trình này tính số lần số nguyên tố p xuất hiện trong giai thừa n!.
//Input:
//Một dòng gồm 2 số nguyên n và p:
//n là số cần tính giai thừa (n!).
//p là số nguyên tố cần đếm số lần xuất hiện trong n!.
//Output:
//Một số nguyên duy nhất, là số lần p chia hết trong n!.
//eg:
//Input: 5 2
//✅ Tính toán:
//5! = 5 × 4 × 3 × 2 × 1 = 120
//Đếm số lần 2 là ước của 120:
//120 ÷ 2 = 60 ✅ (chia hết)
//60 ÷ 2 = 30 ✅ (chia hết)
//30 ÷ 2 = 15 ✅ (chia hết)
//15 ÷ 2 = 7.5 ❌ (không chia hết nữa)
//Có 3 lần chia hết cho 2 → Kết quả là 3.
//✅ Output: 3
public class Ex5 {
//De bai co the ra la 1trieu giai thua co the chia het cho toi da la bnhieu
//eg: don gian khi mk tinh 20! so da rat lon roi va da den gioi han cua so long long roi
//vay thi lm sao de co the tinh dc 1trieu!
//the nen ta co cach nay toi uu hon
//eg: n=10!, p=2
//-> ptich thua so ngto cua 10! -> ptich thua so 2 trg tich co bnhieu so
    //Ham cua cach 2
    public static int gegree(int n, int p){
        int sum=0;
        //duyet cac boi cua p<=n
        //              //moi uoc chi duoc tang them p don vi nen t se ko toi uu = cach tiep theo -> cach 3
        for(int i=p;i<=n;i+=p){
            //phai test xem trg boi i do co bao nhieu so p
            int j=i;
            //neu ma i% thi se anh huong den vong for ben tren
            //->dung 1 bien tam luu kqua cua i vao sau do chia tren bien tam
            //-> ko anh huong
            while (j%p==0){
                ++sum;
                j=j/p;
            }
        }
        return sum;
    }
    //C3
    //Cthuc : Legendre formula : no se luy thua thang i len
    public static int legendre(int n, int p){
        int sum=0;
        for(int i=p;i<=n;i*=p){
            sum+=n/i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //chi ap dung khi giai thua nho
        int n=sc.nextInt(), p=sc.nextInt();
        // //// C1
        long gt=1;
        //gt la bien luu kqua cua n!
        //gan gt=1 vi gthua luon bdau=1
        for(int i=1;i<=n;i++){
            gt*=i;
            //dung vong lap for de *dan tu 1->n
            //moi lan lap nhan gt vs i
        }
        int count=0;
        while(gt%p==0){
            ++count;
            gt/=p;
        }
        System.out.println(count);
        // //// C2
        //thi luc nay so giai thua lon den may ma muon tim cac boi p cua no van deu đc
        System.out.println(gegree(n,p));
        // //// C3
        System.out.println(legendre(n,p));
    }
}
