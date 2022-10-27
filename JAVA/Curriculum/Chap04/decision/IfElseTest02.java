package kr.co.ezenac.decision;

import java.util.Scanner;

public class IfElseTest02 {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0111";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scan.nextLine();
		
		System.out.print("PW : ");
		String pw = scan.nextLine();
	
		if ((id.equals(ADMIN_ID)) && (pw.equals(ADMIN_PASSWORD))) {
			System.out.println("로그인 되었습니다.");
		}
		else 
			System.out.println("로그인에 실패하였습니다.");
	}
}
