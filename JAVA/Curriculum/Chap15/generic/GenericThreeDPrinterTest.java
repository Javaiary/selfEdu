package kr.co.ezenac.generic;

public class GenericThreeDPrinterTest {
	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> pwdPrinter = new GenericThreeDPrinter<>();
		Powder pwd = new Powder();
		pwdPrinter.setMaterial(pwd);
		System.out.println(pwdPrinter);

		GenericThreeDPrinter<Plastic> plstPrinter = new GenericThreeDPrinter<>();
		Plastic plst = new Plastic();
		plstPrinter.setMaterial(plst);
		System.out.println(plstPrinter);
		
		pwdPrinter.print();
		plstPrinter.print();
		
//		GenericThreeDPrinter<Water> wtrPrinter = new GenericThreeDPrinter<>();
		// 확장(extends) 받은 클래스가 아니기 때문에 사용 불가
		
	}
}
