package baitaptuan3;

import java.text.NumberFormat;
import java.util.Locale;

public class congnhan {
	//thuoc tinh
 private String maCN, mTen;
 private int mSoSP;
 private double dg;
  //dong goi
 public String getMaCN() {
	 return maCN;
 }
 public void setMaCD(String maCN) {
	 this.maCN = maCN;
 }
 
 public String getMTen() {
	 return mTen;
 }
 public void setMTen(String mTen) {
	 this.mTen =mTen;
 }
 public int getMSoSP() {
	 return mSoSP;
 }
 public void setMSoSP(int mSoSP) throws Exception {
	 if (mSoSP<0) {
		 throw new Exception("loi");
		
	} else {
		this.mSoSP= mSoSP;

	}
 }
 public double getDg() {
	 return dg;
 }
 public void setLuong(double dg) throws Exception {
	 if (dg<0) {
		 throw new Exception("loi");
		
	} else {
		this.dg= dg;

	}
 }
 public congnhan(String maCN, String mTen, int mSoSP, double dg) {
	 this.maCN= maCN;
	 this.mTen=mTen;
	 this.mSoSP=mSoSP;
	 this.dg=dg;
 }
 
 
//phuongthuc
 public double getLuong() {
	if (mSoSP >1 && mSoSP <200) {
		dg=0.5;
	} else if(mSoSP>199 && mSoSP<400) {
        dg=0.05;
	}
	else if(mSoSP>399 && mSoSP<600) {
		dg=0.6;
	}
	else {
		dg=0.65;
	}
	double luong = mSoSP*dg;
	return luong;
 }
 //format tiente
 Locale lc= new Locale("vi","VN");
 NumberFormat nf= NumberFormat.getCurrencyInstance(lc);
//toString
 public String toString() {
	 return "congnhan [maCN="+ maCN+",mTen=" +mTen +",mSoSP="+mSoSP +",dg=" +dg+",getLuong()=" +nf.format(getLuong())+"]"; 
 }
}