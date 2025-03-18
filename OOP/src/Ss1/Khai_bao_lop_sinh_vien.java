package Ss1;
//Bai 5: Khai bao lop sinh vien
//Viết chương trình khai báo lớp sinh viên với các thuộc tính được nhập trên 6 dòng lần lượt là:
//Mã sinh viên: dạng xâu ký tự, độ dài không quá 10, không trùng nhau
//Họ tên: dạng xâu ký tự, độ dài không quá 50
//Giới tính: xâu ký tự với một trong hai giá trị: “Nam” hoặc “Nu”
//Lớp: xâu ký tự, độ dài không quá 30
//Email: độ dài không quá 50
//Số điện thoại: độ dài không quá 10
//Tạo các đối tượng sinh viên và in thông tin của từng đối tượng ra màn hình.
//Input
//Dòng đầu ghi số sinh viên
//6 dòng tiếp theo lần lượt mỗi dòng nhập 1 thông tin như mô tả của 1 đối tượng sinh viên
//Output
//In ra thông tin của từng sinh viên, mỗi sinh viên nằm trên một dòng, mỗi thông tin cách nhau bởi dấu phẩy (có khoảng trắng sau dấu phẩy).
//Ví dụ
//Input:
//2
//B21DCCN111
//Hoang Van An
//Nam
//D21CQCN01-B
//hva@gmail.com
//0912999888
//B21DCAT999
//Tran Van Binh
//Nam
//D21CQAT01-B
//tvb@gmail.com
//838831503
//Output:
//B21DCCN111, Hoang Van An, Nam, D21CQCN01-B, hva@gmail.com, 0912999888
//B21DCAT999, Tran Van Binh, Nam, D21CQAT01-B, tvb@gmail.com, 838831503
//Chú ý: Yêu cầu bắt buộc phải khai báo lớp và viết theo hướng đối tượng. Nếu không thì không có điểm.
//Giới hạn thời gian: 1s
//Giới hạn bộ nhớ: 200000Kb
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Student {
    private String msv = "B20DCCN001";
    private String name;
    private String lop;
    private String dob;
    private float gpa;
    public Student() {
        this("", "", "", 0f);
    }
    public Student(String name, String lop, String dob, float gpa) {
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    public String formatDob() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(dob);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + formatDob() + " " + String.format("%.2f", gpa);
    }
}
public class Khai_bao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        float gpa = sc.nextFloat();
        Student stu = new Student(name, lop, dob, gpa);
        System.out.println(stu);
    }
}