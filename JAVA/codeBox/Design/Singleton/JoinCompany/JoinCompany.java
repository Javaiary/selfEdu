package kr.co.ezenac.singleton;

public class JoinCompany {

	public static int serialNum = 2022;
	// 중복방지를 위해 static으로 선언해 줄 것 ★
	private int Id;

	public JoinCompany() {
		Id = serialNum;
		serialNum++;

	}

	public int getId() {
		return Id;
	}
}
