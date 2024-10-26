package leHoangAnh_23676671;

public enum LoaiTienTe {
	VND("Tiền Việt Nam"), USD("Tiền USD"), EURO("Tiền Euro");
	private String ten;
	private LoaiTienTe(String ten) {
		this.ten =ten;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten;
	}

}
