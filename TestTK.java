package thuake;

public class TestTK {
    public static void main(String[] args) {
        HinhHoc h1= new HinhVuong("hinh vuong 1",20.5);
        System.out.println("Dien tich hinh vuong: "+h1.getDienTich());
        HinhHoc h2 = new HinhChuNhat("Hinh Chu: ", 45, 30);
        System.out.println("Dien tich HCN: "+h2.getDienTich());
    }
    
}
