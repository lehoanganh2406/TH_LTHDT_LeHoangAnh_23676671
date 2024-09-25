package stt02_23676671_lehoanganh_may49;

import java.util.ArrayList;
import java.util.List;

public class ListCD {
  List<GiaoDich> ls;
  public ListCD() {
	  ls =new ArrayList<GiaoDich>(2);
  }
  public boolean themCD(GiaoDich g) {
	  if (!ls.contains(g)) {
		return false;
	}else {
		return ls.add(g);
	}
  }
  //xuat giao dich(hien thi giao dich)
  public List<GiaoDich> getAll(){
	  return ls;
  }
  //tong so luong theo loai
  public int tongSoLuongTheoLoai() {
	  int 
  }
  
}
