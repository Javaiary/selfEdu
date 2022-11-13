package kr.co.ezenac.decision03;

public class SwitchCaseYield {

	public static void main(String[] args) {
		
		int month = 3;
		int day =  switch(month) {
			case 1,3,5,7,8,10,12 ->{
				System.out.println("한달은 31일입니다.");
				yield 31;
			}
			case 4,6,9,11 -> {
				System.out.println("한달은 30일입니다.");
				yield 30;
			}
			default -> {
				System.out.println("없는 달입니다.");
				yield 0;				
			}
		};
	}

}
