package bt6_LeHoangAnh_23676671;

import java.util.Arrays;

public class DanhSachHangHoa {
	private HangHoa[] ds;
	private int dem =0;
	public DanhSachHangHoa() {
		ds= new HangHoa[10];
	}
	public DanhSachHangHoa(int n) {
		if(n<=0)
			throw new RuntimeException("So luong hang hoa phai lon hon 0");
		ds = new HangHoa[n];
	}
	//vietphuong thuc them mot hang hoa vao danh sach (them thanh cong neu klhong trung ma hang)
	public boolean them (HangHoa hh) {
		if(dem == ds.length)
			return false;
		for(int i=0; i <dem; i++)
			if (ds[i].getMaHang().equalsIgnoreCase(hh.getMaHang()))
				return false;
		ds[dem++] =hh;
		return false;
	}
	//phuong thuc sap xep hang hoa theo ten hang tang dan
	public HangHoa[] sapXepDSHHTheoTenHang() {
		HangHoa[] dsMoi =ds.clone();
		for(int i=0; i <dem-1; i++)
			for(int j=i+1; j <dem; j++)
				if(dsMoi[i].getTenHang().compareToIgnoreCase(dsMoi[j].getTenHang())>0){
				HangHoa temp =dsMoi[i];
				dsMoi[i] =dsMoi[j];
				dsMoi[j]= temp;
			}
		return Arrays.copyOf(dsMoi, dem);
				}
	// phuong thuc lay thong tin cac hang thuc pham kho ban
	public HangHoa[] layDSHangThucPhamKhoBan() {
		HangHoa[] dsMoi =new HangHoa[dem];
		int k=0;
		for(int i=0; i <dem; i++)
			if(ds[i] instanceof HangThucPham && ((HangThucPham) ds[i]).danhGia().equalsIgnoreCase("kho ban"))
					dsMoi[k++] =ds[i];
		return Arrays.copyOf(dsMoi, k);
		
	}
	//phong thuc lay thong tin tung loai hang hoa
	public HangHoa[] getDSHHTheoTungLoaiHang(String loaiHang) {
		HangHoa[] dsMoi = new HangHoa[dem];
		int k=0;
		for(int i=0; i <dem; i++) {
			if(ds[i].getClass().getSimpleName().equalsIgnoreCase(loaiHang))
				dsMoi[k++]=ds[i];
		}
		return Arrays.copyOf(dsMoi, k);
	}
	public HangHoa[] getDs() {
		return Arrays.copyOf(ds, dem);
	}
}
