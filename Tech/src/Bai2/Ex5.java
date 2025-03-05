package Bai2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //Bài 19. Mua bia
        //28techland là vùng đất mà cư dân cực kì thích uống bia,
        //vì thế để tăng số lượng bia bán ra các cửa hàng bia ở đây đưa ra khuyến mại như sau :
        //Cứ 3 vỏ chai bia sẽ được đổi một chai bia mới. Biết rằng ở 28techland, mỗi chai bia
        //có giá 28 xu, nhiệm vụ của bạn là xác định với N xu cho trước, bạn có thể mua được
        //tối đa bao nhiêu chai bia tính cả việc đổi thưởng bằng vỏ chai?
        //Gợi ý : Bước 1 : Tính số lượng chai bia mua bằng tiền (n / 28).
        //Sau đó làm 1 vòng lặp while với điều kiện lặp là số lượng vỏ chai mình có >= 3,
        //bên trong vòng lặp thì tính số lượng chia bia đổi được và cập nhật vỏ chai.
        //Input Format
        //Dòng duy nhất chứa N là số đồng xu ban đầu
        //Constraints
        //1<=N<=10^6
        //Output Format
        //In ra số lượng chai bia tối đa có thể mua
        //Sample Input:
        //138
        //Sample Output:
        //5
        //Explanation:
        //138 xu có thể mua được 4 chai bia, 4 vỏ chai của chai bia này sẽ đổi thêm được 1 chai bia nữa.
        //Kết quả tổng số chai bia có thể mua là 5.
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        //so luong vo chai mua = tien
        long res=n/28;
        //so luong vo chai duoc
        long vochai=n/28;
        //lap cho den khi vo chai >=3
        while(vochai>=3){
            //tinh so luong vo chai dem duoc la bao nhieu
            long temp= vochai/3;
            res+=temp;
            //de tinh xem du bao nhieu vo chai ma ko doi duoc thi tinh so vo chai do
            vochai=temp + (vochai%3);
        }
        System.out.println(res);
    }
}
//bai nay hoi hoi
