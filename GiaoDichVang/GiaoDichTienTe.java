package leHoangAnh_23676671;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	
	private double tiGia;
	private LoaiTienTe loaiTienTe;
	@Override
	public double getThanhTien() {
		return (loaiTienTe == LoaiTienTe.VND ? 1 :tiGia)*soLuong*donGia;
	}
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public LoaiTienTe getLoaiTienTe() {
		return loaiTienTe;
	}
	public void setLoaiTienTe(LoaiTienTe loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			LoaiTienTe loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}
	

}
