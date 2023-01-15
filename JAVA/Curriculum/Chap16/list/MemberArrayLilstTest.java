package kr.co.ezenac.list;

public class MemberArrayLilstTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member mem1 = new Member(2022, "VAL");
		Member mem2 = new Member(2023, "JON");
		Member mem3 = new Member(2024, "TOM");
		Member mem4 = new Member(2025, "CRUISE");

		memberArrayList.addMember(mem1);
		memberArrayList.addMember(mem2);
		memberArrayList.addMember(mem3);
		memberArrayList.addMember(mem4);

		memberArrayList.showAllMembers();

		memberArrayList.removeMember(2023);

		memberArrayList.showAllMembers();

	}
}
