package baitap;

public class TestHT {
	public static void main(String[] args) throws Exception {
		tam t= new tam("A", 15,16);
		hinhtron h1= new hinhtron(10, t);
		System.out.println("Hinh tron tam: "+t.toString() + h1.toString());
	}
}
