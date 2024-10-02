package bt6_LeHoangAnh_23676671;

import java.time.LocalDate;
import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		DanhSachHangHoa ds = null;
		Scanner sc = null;
		boolean flag =true;
		int n =0;
		try {
			sc = new Scanner(System.in);
			while(flag) {
				try {
					System.out.println("Nhap so phan tu mang: ");
					n = sc.nextInt();
					ds = new DanhSachHangHoa(n);
					flag = false;
				}catch (RuntimeException e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
		}finally {
			sc.close();
		}
		khoiTaoDS(ds);
		System.out.println("Danh sach hang hoa sau khi sap xep theo ten hang");
		HangHoa[] dsMoi =ds.sapXepDSHHTheoTenHang();
		for(HangHoa hh : dsMoi)
			System.out.println(hh);
		
		System.out.println("Danh sach hang thuc pham");
		HangHoa[] dsHangMayDien = ds.getDSHHTheoTungLoaiHang("HangThucPham");
				for(HangHoa hh : dsHangDienMay)
					System.out.println(hh);
		
		System.out.println("Danh sach hang hoa");
		HangHoa[] dsHH = ds.getDs();
				for(HangHoa hh : dsHH)
					System.out.println(hh);
	}

private static void khoiTaoDS(DanhSachHangHoa ds) {
	ds.them(new HangThucPham("TP001", "Sữa", 8000.0, 10, "Vinnamilk", LocalDate.of(2023,10,1), LocalDate.of(2024,9,1)));
	ds.them(new HangThucPham("TP002", "Gạo", 18000.0, 10, "Sông Lam", LocalDate.of(2023,10,1), LocalDate.of(2024,10,1)));
	ds.them(new HangThucPham("TP003", "Muối", 7000.0, 10, "Nha Trang Store", LocalDate.of(2023,10,1), LocalDate.of(2024,10,1)));
	ds.them(new HangThucPham("TP004", "Đường", 21000.0, 10, "Đường Biên Hòa", LocalDate.of(2023,10,1), LocalDate.of(2024,10,1)));

	
	ds.them(new HangDienMay("DM001", "Tivi", 8_000_000.0, 10, 14, 1500.0));
	ds.them(new HangDienMay("DM002", "Bàn ủi", 200_000.0, 10, 6, 2000.0));
}


}
