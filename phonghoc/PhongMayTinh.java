package leHoangAnh_23676671;

public class PhongMayTinh extends PhongHoc {

	@Override
	public boolean getDatChuan() {
		
		return (duSang() && soMayTinhTP());
	}
   private int soMayTinh;
public int getSoMayTinh() {
	return soMayTinh;
}
public void setSoMayTinh(int soMayTinh) {
	this.soMayTinh = soMayTinh;
}
 public boolean soMayTinhTP() {
	 if (getDienTich()/1.5 == getSoMayTinh()) {
		return true;
	} else {
		return false;

	}
 }
public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
	super(maPhong, dayNha, dienTich, soBongDen);
	this.soMayTinh = soMayTinh;
}
 @Override
public String toString() {
	String soMayTinhTP = soMayTinhTP() ? "du may dat cach 1.5m" :"khong du";
	return super.toString()+ String.format("%10|%10s|", getSoMayTinh(), soMayTinhTP);
}
}
