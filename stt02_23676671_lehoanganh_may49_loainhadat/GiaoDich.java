package stt02_23676671_lehoanganh_may49;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public abstract class GiaoDich {
public abstract double getThanhTien();
protected String maGD;
protected LocalDate ngayGD;
protected double donGia;
protected double dienTich;
public String getMaGD() {
	return maGD;
}
public void setMaGD(String ma) throws IllegalAccessException {
	if (ma!=null) {
		this.maGD = ma;
	} else {
          throw new IllegalAccessException("Loi ma");
	}
	
}
public Calendar getNgayGD() {
	return ngayGD;
}
public void setNgayGD(Calendar ngayGD) {
	this.ngayGD = ngayGD;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia = donGia;
}
public double getDienTich() {
	return dienTich;
}
public void setDienTich(double dienTich) {
	this.dienTich = dienTich;
}
public GiaoDich() throws IllegalAccessException {
	 this ("", LocalDate.now(),0,0);
}
public GiaoDich(String ma, LocalDate ngaGD, double donGia, double dienTich) throws IllegalAccessException {
	if (ma!=null) {
		this.maGD = ma;
	} else {
          throw new IllegalAccessException("Loi ma");
	}
	this.ngayGD = ngaGD;
	this.donGia = donGia;
	this.dienTich = dienTich;
}


@Override
public int hashCode() {
	return Objects.hash(maGD);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	GiaoDich other = (GiaoDich) obj;
	return Objects.equals(maGD, other.maGD);
}
@Override
	public String toString() {
	  String s="";
	  s+=s.format("|%10|%$10|%10|%10|", getMaGD(), getNgayGD(),getDonGia(),getDienTich());
		return s;
	}
}
