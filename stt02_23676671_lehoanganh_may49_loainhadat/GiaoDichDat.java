package stt02_23676671_lehoanganh_may49;

import java.time.LocalDate;
import java.util.Calendar;

public class GiaoDichDat extends GiaoDich{

	private String loaiDat;
	
	public String getLoaiDat() {
		
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	
	public GiaoDichDat(String ma, LocalDate ngaGD, double donGia, double dienTich, String loaiDat)
			throws IllegalAccessException {
		super(ma, ngaGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiDat()=="A") {
			return getDienTich()*getDonGia()*1.5;
		} else {
			return getDienTich()*getDonGia();

		}
		
	}

@Override
public String toString() {
	String s="";
	s=s.format("%10|%10|", getLoaiDat(), getThanhTien());
	return super.toString()+s;
}



	
}
