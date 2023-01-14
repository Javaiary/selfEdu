package kr.co.ezenac.nongeneric;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		Powder powder = new Powder();
		printer1.setMaterial(powder);
		
		Powder powder2 = printer1.getMaterial();
		System.out.println(powder2);
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		
		Plastic plastic2 = printer2.getMaterial();
		System.out.println(plastic);
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		printer3.getMaterial();	//return type : Object
		Powder powder3 = (Powder)printer3.getMaterial(); // 강제 캐스팅
		
	}
}
