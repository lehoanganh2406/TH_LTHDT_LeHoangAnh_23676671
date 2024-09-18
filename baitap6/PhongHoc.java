package baitap6;

public class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public boolean datChuan() {
        return (dienTich / soBongDen) >= 10;
    }

    @Override
    public String toString() {
        return "Mã phòng: " + maPhong + ", Dãy nhà: " + dayNha + ", Diện tích: " + dienTich + ", Số bóng đèn: " + soBongDen;
    }
}
