package leHoangAnh_23676671;

public class PhongThiNghiem extends PhongHoc {

	@Override
	public boolean getDatChuan() {
		return (duSang() && isBonRua());
	}
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isBonRua() {
		return bonRua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	@Override
	public String toString() {
		String bonRua= isBonRua() ? "co bon rua": "khong co bon rua";
		return super.toString() + String.format("%10s|%10s|%10s",getChuyenNganh(), getSucChua(), bonRua);
	}
    
}
