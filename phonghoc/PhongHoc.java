package leHoangAnh_23676671;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract boolean getDatChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	//dong goi
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws Exception {
		if (maPhong != "") {
			this.maPhong = maPhong;
		} else {
            throw new Exception("Loi Ma Phong");
		}
		
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception {
		this.soBongDen = soBongDen;
		
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	//phuong thuc du sang
	public boolean duSang() {
		if (getDienTich()/10 == getSoBongDen()) {
			return true;
		} else {
			return false;

		}
	}
	public PhongHoc() {}
	@Override
	public String toString() {
		String duSang = duSang() ? "dat chuan sang" : "khong du sang";
		String s="";
		s+=s.format("|%10s|%10s|%10|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), duSang);
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
}
