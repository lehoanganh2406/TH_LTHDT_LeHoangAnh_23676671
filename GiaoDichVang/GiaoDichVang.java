package leHoangAnh_23676671;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;


	@Override
	public double getThanhTien() {
		return soLuong*donGia;
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = "";
	}
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	public void getLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	

}
