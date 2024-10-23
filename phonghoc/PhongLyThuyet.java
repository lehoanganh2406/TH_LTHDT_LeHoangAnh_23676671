package leHoangAnh_23676671;

public class PhongLyThuyet extends PhongHoc {

	@Override
	public boolean getDatChuan() {
		return (duSang() && isMayChieu());
	}
	private boolean mayChieu;
	//dong goi 
	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	public PhongLyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
		
	@Override
	public String toString() {
		String mayChieu = isMayChieu() ? "Co MAy CHieu" :"Khong co May Chieu";
		return super.toString()+ String.format("%10s|", mayChieu);
	}

}
