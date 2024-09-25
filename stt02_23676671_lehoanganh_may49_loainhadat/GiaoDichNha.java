package stt02_23676671_lehoanganh_may49;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	

	public String getLoaiNha() {
		return loaiNha;
	}


	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
   

	public GiaoDichNha(String ma, LocalDate ngaGD, double donGia, double dienTich, String loaiNha)
			throws IllegalAccessException {
		super(ma, ngaGD, donGia, dienTich);
		this.loaiNha = loaiNha;
	}


	@Override
	public double getThanhTien() {
		if (getLoaiNha()=="nhaCC") {
			return getDienTich()*getDonGia();
			
		} else {
             return getDienTich()*getDonGia()*0.9;
		}
		
	}
@Override
public String toString() {
	String s="";
	s+=s.format("%10|%10|", getLoaiNha(), getThanhTien());
	return super.toString()+s;
}
}
