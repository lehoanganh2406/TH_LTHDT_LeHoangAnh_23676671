package thuake;
public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;
    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        if (chieuDai < 0){
            System.out.println("loi chieudai");
        } else {
        this.chieuDai =chieuDai;
            
        }
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        if (chieuRong <0){
            System.out.println( "loi chieurong");
        }else{
        this.chieuRong = chieuRong;

        }
    }
    public HinhChuNhat(String tenHinh, double d, double r){
        super(tenHinh);
        chieuDai = d;
        chieuRong = r;
    }
    public double getDienTich(){
        return chieuDai*chieuRong;
    }
}

