package Bai2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bai 5: Vong lap
        //Input: Nhap vao day so có khong qua 10000 so nguyen.
        //hay xdinh trg qtrinh nhap co cuat hien so 2022 hay khong
        //dong dau tien la so luong so nguyen se nhap:
        //n dong thu 2 la n so viet cach nhau 1 khoang trang
        //Constraints: 1<=n<=10000 : cac so duoc nhap la so nguyen khong qua 10^6
        //Output: In yes neu trg cac so vua nhap co so 2022, nguoc lai in no
        //Input: 4
        //       2019 2020 2021 2022
        //Output: YES
        int n = sc.nextInt();
        //bien boolen danh dau xem trg qtrinh nhap co so 2022 hay ko
        boolean flag = false;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==2022){
                flag=true;
                //du eg da tim thay 1 so 2022 o day nhg van ko duoc break vong lap ma van phai de vong lap chay het de tranh loi
            }
        }
        //sau khi ket thuc vong for ta ket luan
        //eg: ko co 2022 in NO
        //la Output
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
