package leHoangAnh_23676671;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListPhongHoc {
	List<PhongHoc> ls;
	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>(2);
	}
//them phong
	public boolean themPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		} else {
          ls.add(p);
          return true;
		}
	}
	public int soPhongHoc() {
		return ls.size();
		}
	public boolean xoaPhong(String maP) {
		for(PhongHoc ph :ls)
			if (ph.getMaPhong().equalsIgnoreCase(maP)) {
			ls.remove(ph);
			return true;
	}
	return false;
}
	public List<PhongHoc> xuatPhong(){
		return ls;
	}
	public List<PhongHoc> dsPhongDatChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
	for (PhongHoc ph :ls)
		if (ph.getDatChuan()) {
			dsDC.add(ph);
		}
	return dsDC;
	}
	public void sapXep(){
		Collections.sort(ls, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				String x = new String(o1.getMaPhong());
				String y = new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}

		});
	}
	public boolean soBongDen(String maPhong, int soBong) throws Exception {
		for (PhongHoc ph:ls)
			if (maPhong.equalsIgnoreCase(ph.getMaPhong())) {
				ph.setSoBongDen(soBong);
				return true;
			}
		return false;
	}
}
