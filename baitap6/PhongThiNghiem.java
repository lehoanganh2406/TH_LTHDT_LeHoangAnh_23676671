package baitap6;

public class PhongThiNghiem extends PhongHoc {
    private int soMay;
    private String chuyenNganh;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, int soMay, String chuyenNganh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMay = soMay;
        this.chuyenNganh = chuyenNganh;
    }

    public int getSoMay() {
        return soMay;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    @Override
    public boolean datChuan() {
        return (dienTich / soBongDen) >= 10 && soMay >= 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số máy: " + soMay + ", Chuyên ngành: " + chuyenNganh;
    }
    
}
