package baitap6;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    @Override
    public boolean datChuan() {
        return (dienTich / soBongDen) >= 10 && soMayTinh >= 20;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số máy tính: " + soMayTinh;


    }
}
