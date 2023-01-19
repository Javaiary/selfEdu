package kr.co.ezenac.set02;


public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member mem1 = new Member(2022, "VAL");
		Member mem2 = new Member(2023, "JON");
		Member mem3 = new Member(2024, "TOM");
		Member mem4 = new Member(2025, "CRUISE");
		
		memberTreeSet.addMember(mem1); 
		memberTreeSet.addMember(mem2); 
		memberTreeSet.addMember(mem3); 
		memberTreeSet.addMember(mem4); 
		memberTreeSet.ShowAllMember();
		

		
		
		
	}
}
