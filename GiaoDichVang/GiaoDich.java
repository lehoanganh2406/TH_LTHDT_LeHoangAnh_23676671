package leHoangAnh_23676671;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class GiaoDich {
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected int soLuong;
	public abstract double getThanhTien();
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.#");
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Giao Dich [Ma giao dich: " + maGiaoDich + ", ngay giao dich: " + ngayGiaoDich.format(df2) + ", don gia: " + df.format(donGia)
		   + ", so luong: "+ soLuong + ", Thanh Tien: " + df.format(getThanhTien()) +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maGiaoDich);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGiaoDich, other.maGiaoDich);
	}
	
}
