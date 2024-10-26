package leHoangAnh_23676671;

import java.time.LocalDate;

public class TestGD {
	private static final LoaiTienTe VND = null;

	public static void main(String[] args) {
		DanhSachGiaoDich ds = new DanhSachGiaoDich();
		GiaoDichVang v1 = new GiaoDichVang("GDV01", LocalDate.of(2023, 10, 2),500000 , 10, "SJC");
		ds.themGiaoDich(v1);
		GiaoDichTienTe t1 = new GiaoDichTienTe("GDTT01", LocalDate.of(2023, 7, 4), 2300, 100, 21, VND);
		ds.capNhatGiaoDich(t1);
		ds.getDSGDDonGiaLonNhat();
	}
    
}
