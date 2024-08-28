package baitap;

public class hinhtron {
    private double banKinh;
    private tam t;
    
    public tam getT() {
    	return t;
    }
    public void setT(tam t) throws Exception {
    	if (t!=null) {
			this.t= t;
		} else {
			throw new Exception("Loi");
		}
    }
    //hang thuc
    public static final double PI=3.1416;
    public double getBanKinh() {
    	return banKinh;
    }
    public void setBanKinh(double bk) throws Exception {
    	if (bk>0) {
			this.banKinh= bk;
		} else {
			throw new Exception("Loi");
		}
    }
    //tao ham
    public hinhtron() {}
    public hinhtron(double banKinh, tam t) {
    	this.banKinh = banKinh;
    	this.t=t;
    }
    //tinhdientich va chuvi
    public double getDienTich() {
    	return getBanKinh()*getBanKinh()*PI;
    }
    public double getChuVi() {
    	return getBanKinh()*2*PI;
    }
    //mauin
    public String toString() {
    	String m="";
    	m+=m.format("%-3s, %10s, %10s,", getBanKinh(), getDienTich(), getChuVi());
    	return m;
    }
    public static void main(String[] args) throws Exception {
		hinhtron h1= new hinhtron(10, new tam("O",12,12));
		System.out.println(h1);
	}
}
