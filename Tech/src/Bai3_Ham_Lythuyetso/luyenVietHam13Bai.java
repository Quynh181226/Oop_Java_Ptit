package Bai3_Ham_Lythuyetso;

import java.util.Scanner;

//Bai1: Luyện tập viết hàm (Quan trọng)
//Cho số nguyên n không âm. Viết hàm xử lý các yêu cầu sau:
//Input Format: Số duy nhất n
//Constraints: 2<=n<=1000;
//Output Format: In ra 13 dòng tương ứng với các yêu cầu ở trên.
//Sample Input: 36
//Sample Output:
//0
//9
//6
//3
//63
//2
//3
//1
//0
//726
//0
//1
//45
//Cau1 and cau6 can giai thichh
//can giai thich them 1 cai nx do la sao co luc thi n/=10 cung dong vs if luc thi ben duoi if
public class luyenVietHam13Bai {
//1.Kiểm tra n là số nguyên tố, nếu đúng in 1, sai in 0.
public static boolean isPrime(int n){
    if(n<2){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
//2.In tổng chữ số của n.
public static int Sum(int n){
    int sum = 0;
    //lap lai cho den khi n=0 tuc ko con so nao de tinh tong cong don nua
    while (n!=0){
        sum+=n%10;
        n/=10;
    }
    return sum;
}
//3.In tổng chữ số chẵn của n.
//chu y: n%10: lay chu so cuoi
//       n/=10: bo chu so cuoi
    public static int SumEven(int n){
        int sum = 0;
        while (n!=0){
            if((n%10)%2==0){
                sum+=n%10;
            }
            n/=10;
        }
        return sum;
    }
//4.In tổng chữ số của n là số nguyên tố.
    //Tại sao chỉ kiểm tra 2, 3, 5, 7?
    //Vì r là một chữ số (được lấy từ n % 10), nên r chỉ có thể là một trong các số từ 0 đến 9.
    //Trong phạm vi 0-9, các số nguyên tố duy nhất là 2, 3, 5, 7.
    public static int Sum_Snt(int n){
    int sum = 0;
    while (n!=0){
        int r=n%10;
        //b1:ktra do la so ngto
        if(r==2||r==3||r==5||r==7){
        //b2:cong vao tong
            sum+=r;
        }
        n/=10;
    }
    return sum;
    }
//5.In số lật ngược của n. Ví dụ 123 in 321.
//ktra dk hop le
//nhan de dao nguoc
//lay chu so cuoi cung
//bo chu so cuoi cung
//tra ve so da lat nguoc
    public static int Reverse(int n){
        //variable rev de luu so dao nguoc
        int rev=0;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
//6.In số lượng ước của n là số nguyên tố (làm tương tự như phân tích thừa số ng tố).
    public static int Number_Uoc(int n){
    int count=0;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count++;
            while (n%i==0){
                //loai bo cac boi so cua i trong n -> de co the ra dc kqua cuoi cung la uoc so cua n
                n/=i;
            }
        }
    }
    if(n>1){
        count++;
    }
    return count;
    }
//7.In ước nguyên tố lớn nhất của n (làm tương tự như phân tích thừa số ng tố).
    //Ban cht cua bai nay la khi ma tim uoc cua so ngto xg thi uoc cuoi cung cg = lon nhat
    // -> gan = cuoi cung -> tim dc lon nhat
//60 = 2 2 3 5 : day ne eg o day la 5
//28 = 2 2 7
//13 = 13
//100 = 2 2 5 5
    public static int Uoc_max(int n){
        //tao 1 bien ans xg cu gap thua so nguyen to nao thi gan cho cai so day = ans
        int ans=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans=i;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            ans=n;
        }
        //khi ma n >1 thi khi do n ms la thua so ngto cuoi cung thi khi do gan ans =n
        return ans;
    }
//8.Kiểm tra nếu n tồn tại ít nhất 1 số 6, nếu đúng in 1, sai in 0.
    public static int Min_6(int n){
    while (n!=0){
        if(n%10==6){
            return 1;
        }
        n/=10;
    }
    return 0;
    }
//9.Kiểm tra nếu tổng chữ số của n chia hết cho 8, nếu đúng in 1, sai in 0.
    public static int Divide_by_8(int n){
    int sum=0;
    while (n!=0){
        sum+=n%10;
        n/=10;
    }
    if(sum%8==0){
        return 1;
        //cho nay nen return 1 hay sum hay ca hai deu duoc
    }else{
        return 0;
    }
    }
//10.Tính tổng giai thừa các chữ số của n và in ra. Ví dụ n = 123, tổng = 1! + 2! +3!
    public  static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    //chua hieu can xem lai
    public  static int Sum_factorial(int n){
    int sum=0;
    while (n!=0){
        sum+=factorial(n%10);
        n/=10;
    }
    return sum;
    }
//11.Kiểm tra n có phải chỉ được tạo bởi 1 số hay không? Ví dụ 222, 333, 99999. Đúng in ra 1, sai in ra 0.
    public   static boolean One_num(int n){
    //lay ham don vi lam mau -> neu khac hang don vi -> false
        int res=n%10;
        while (n!=0){
            if(n%10!=res){
                return false;
            }
            n/=10;
        }
        return true;
    }
//12.Kiểm tra n có "phải có chữ số tận cùng là lớn nhất" hay không
//tức là không có chữ số nào của n lớn hơn chữ số hàng đơn vị của nó
//nếu đúng in 1, sai in 0.
    public static boolean Num_last (int n){
    int r=n%10;
    while (n!=0){
        if(n%10>r){
            return false;
        }
        n/=10;
    }
    return true;
    }
//13.In tổng lũy thừa chữ số của n với số mũ là số chữ số.
//ví dụ 123 thì tính 1^3+2^3+3^3.-> chu y: nhìn vao eg
    //CHUNG QUY LA CHUA HIEU LAM
    public  static int count (int n){
    int cnt=0;
    while(n!=0){
        cnt++;
        n/=10;
    }
    return cnt;
    }
    public static  int Sum_fower(int n){
    int sum=0;
    //lay chu so cuoi cua n
    int a=count(n);
    while (n!=0){
        sum+= (int) Math.pow(n%10,a);
        n/=10;
    }
    return sum;
    }
public  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPrime(n) ? "1" : "0");
    System.out.println(Sum(n));
    System.out.println(SumEven(n));
    System.out.println(Sum_Snt(n));
    System.out.println(Reverse(n));
    System.out.println(Number_Uoc(n));
    System.out.println(Uoc_max(n));
    System.out.println(Min_6(n));
    System.out.println(Divide_by_8(n));
    System.out.println(Sum_factorial(n));
    System.out.println(One_num(n) ? "1" : "0");
    System.out.println(Num_last(n) ? "1" : "0");
    System.out.println(Sum_fower(n));
}
}
