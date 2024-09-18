package baitap6;

public class PhongLyThuyet extends PhongHoc {
    private int soGhe;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, int soGhe) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soGhe = soGhe;
    }

//    public int getSoGhe() {
//    }

    @Override
    public boolean datChuan() {
        return (dienTich / soBongDen) >= 10 && soGhe >= 50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số ghế: " + soGhe;
    }

}
