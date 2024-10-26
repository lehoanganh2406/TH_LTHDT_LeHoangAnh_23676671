package leHoangAnh_23676671;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import leHoangAnh_23676671.GiaoDichTienTe;
import leHoangAnh_23676671.GiaoDich;
import leHoangAnh_23676671.GiaoDichVang;
public class DanhSachGiaoDich implements IGiaoDich {
	private List<GiaoDich> dsgd;
	public DanhSachGiaoDich() {
		dsgd = new ArrayList<>();
	}
	public List<GiaoDich> getDsgd(){
		return dsgd;
	}

	public boolean themGiaoDich(GiaoDich giaoDich) {
		if (giaoDich == null) {
			return false;
		} 
		if (dsgd.contains(giaoDich)) {
			return false;
		}
		dsgd.add(giaoDich);
		return true;
	}
	
	public boolean xoaGiaoDich(String maGD) {
		return dsgd.removeIf(gd -> gd.getMaGiaoDich().equalsIgnoreCase(maGD));
		
	}
      
   
     
	@Override
	public GiaoDich capNhatGiaoDich(GiaoDich gdThongTinMoi) {
		GiaoDich temp = dsgd.stream()
				.filter(gd -> gd.getMaGiaoDich().equalsIgnoreCase(gdThongTinMoi.getMaGiaoDich()))
				.findFirst()
				.orElse(null);
		if (temp != null) {
			temp.setNgayGiaoDich(gdThongTinMoi.getNgayGiaoDich());
			temp.setDonGia(gdThongTinMoi.getDonGia());
			temp.setSoLuong(gdThongTinMoi.getSoLuong());
		if (temp instanceof GiaoDichVang &&gdThongTinMoi instanceof GiaoDichVang) {
			((GiaoDichVang) temp).setLoaiVang(((GiaoDichVang)gdThongTinMoi).getLoaiVang());
		}else if 
			(temp instanceof GiaoDichTienTe && gdThongTinMoi instanceof GiaoDichTienTe){
			((GiaoDichTienTe)temp).setTiGia(((GiaoDichTienTe)gdThongTinMoi).getTiGia());	
			((GiaoDichTienTe) temp).setLoaiTienTe(((GiaoDichTienTe)gdThongTinMoi).getLoaiTienTe());
			}
		return temp;
		}
		
		        
		return null;
	}
	@Override
	public Map<String, Integer> getTongSlTheoTungLoai() {
		
		return dsgd.stream()
				.collect(Collectors.groupingBy(gd -> gd.getClass().getSimpleName(), Collectors.summingInt(GiaoDich :: getSoLuong)));
	}
	@Override
	public double getTBThanhTienDgTienTe() {
		return dsgd.stream()
				.filter(gd -> gd instanceof GiaoDichTienTe)
				.mapToDouble(gd->gd.getThanhTien())
				.average()
				.getAsDouble();
	}
	@Override
	public List<GiaoDich> getDSGDTrenDonGia(double donGia) {
		return dsgd.stream()
				.filter(gd -> gd.getDonGia() > donGia)
				.toList();
	}
	@Override
	public List<GiaoDich> sapXepDSGDTheoTungLoaiVaTheoDonGia() {
		Comparator<GiaoDich> compareClassName = Comparator.comparing(gd -> gd.getClass().getSimpleName());
		Comparator<GiaoDich> compareDonGia = Comparator.comparing(GiaoDich :: getDonGia);
		return dsgd.stream()
				.sorted(compareClassName.thenComparing(compareDonGia))
				.toList();
		
	}
	public List<GiaoDich> getDSGDDonGiaLonNhat(){
		double donGiaMax = dsgd.stream()
				.mapToDouble(dg -> dg.getDonGia())
				.max()
				.getAsDouble();
		return dsgd.stream()
				.filter(gd-> gd.getDonGia()== donGiaMax)
				.toList();
	}
	@Override
	public void xoaTatCaGDTheoThangNam(int thang, int nam) {
		dsgd.removeIf(gd ->gd.getNgayGiaoDich().getMonthValue() == thang && gd.getNgayGiaoDich().getYear() == nam);
		
	
	}

}

