package kr.co.ezenac.decision03;

public class SwitchCaseTest03 {
//문자열이 지원되는 switch - case 문	
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
