package kr.co.ezenac.map;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		Member mem1 = new Member(2022, "VAL");
		Member mem2 = new Member(2023, "JON");
		Member mem3 = new Member(2024, "TOM");
		Member mem4 = new Member(2025, "CRUISE");

		memberHashMap.addMember(mem1);
		memberHashMap.addMember(mem2);
		memberHashMap.addMember(mem3);
		memberHashMap.addMember(mem4);

		Member mem5 = new Member(2025, "CRUISE");
		memberHashMap.addMember(mem5);

		memberHashMap.showAllMember();
		System.out.println();

		memberHashMap.removeMember(2025);
		memberHashMap.showAllMember();

	}
}
