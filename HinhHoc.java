package thuake;

public abstract class HinhHoc {
    protected String tenHinh;
    public String getTenHinh(){
        return tenHinh;
    }
    public void setTenHinh(String tenHinh){
        if (tenHinh != null && tenHinh.length()>0) {
        this.tenHinh = tenHinh;
       } else { 
        System.out.println("tenhinng khooong hop le");
            
        }
        }
        public HinhHoc(String tenHinh){
            this.tenHinh = tenHinh;

        }
        public abstract double getDienTich();
        public HinhHoc(){}
        public String toString(){
            return super.toString();
        }
  

}
