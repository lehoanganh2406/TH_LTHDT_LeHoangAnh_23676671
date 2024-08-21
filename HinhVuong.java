package thuake;

public class HinhVuong extends HinhHoc {
    private double canh;
    public double getCanh(){
        return canh;
    }
    public void setCanh(double canh){
        if (canh <0) {
            System.out.println("loi canh");
            
        } else {
        this.canh = canh;
            
        }
    }
    public HinhVuong(){
    }
    public HinhVuong(String tenHinh){
        super(tenHinh);}
        public HinhVuong(String tenHinh, double canh){
            super (tenHinh);
            this.tenHinh =tenHinh;
        this.canh = canh;        }
         public double getDienTich(){
            return canh*canh;
         }
    
}
