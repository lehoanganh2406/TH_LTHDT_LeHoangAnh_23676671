package baitap6;

public class QuanLyDanhSachPhongHoc {
    private PhongHoc[] danhSachPhongHoc;
    private int soPhongHoc;

    public QuanLyDanhSachPhongHoc(int n) {
        danhSachPhongHoc = new PhongHoc[n];
        soPhongHoc = 0;
    }

    public void themPhongHoc(PhongHoc phongHoc) {
        danhSachPhongHoc[soPhongHoc++] = phongHoc;
    }

    public void inDanhSachPhongHoc() {
        for (int i = 0; i < soPhongHoc; i++) {
            System.out.println(danhSachPhongHoc[i]);
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        for (int i = 0; i < soPhongHoc; i++) {
            if (danhSachPhongHoc[i].datChuan()) {
                System.out.println(danhSachPhongHoc[i]);
            }
        }
    }

    public static void main(String[] args) {
        QuanLyDanhSachPhongHoc ql = new QuanLyDanhSachPhongHoc(3);
        ql.themPhongHoc(new PhongThiNghiem("A1", "A", 100, 10, 10, "Hoa"));
        ql.themPhongHoc(new PhongMayTinh("B1", "B", 200, 20, 20));
        ql.themPhongHoc(new PhongLyThuyet("C1", "C", 300, 30, 30));
        ql.inDanhSachPhongHoc();
        System.out.println("Danh sách phòng học đạt chuẩn:");
        ql.inDanhSachPhongHocDatChuan();
    }
    
}
