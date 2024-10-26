package leHoangAnh_23676671;

import java.util.List;
import java.util.Map;

public interface IGiaoDich {
	boolean themGiaoDich(GiaoDich giaoDich);
	boolean xoaGiaoDich(String maCD);
	GiaoDich capNhatGiaoDich(GiaoDich gdThongTinMoi);
	Map<String, Integer> getTongSlTheoTungLoai();
	double getTBThanhTienDgTienTe();
	List<GiaoDich> getDSGDTrenDonGia(double donGia);
	List<GiaoDich> sapXepDSGDTheoTungLoaiVaTheoDonGia();
	List<GiaoDich>  getDSGDDonGiaLonNhat();
	void xoaTatCaGDTheoThangNam(int thang, int nam);


}
