package kr.co.ezenac.set;


public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member mem1 = new Member(2022, "VAL");
		Member mem2 = new Member(2023, "JON");
		Member mem3 = new Member(2024, "TOM");
		Member mem4 = new Member(2025, "CRUISE");

		memberHashSet.addMember(mem1);
		memberHashSet.addMember(mem2);
		memberHashSet.addMember(mem3);
		memberHashSet.addMember(mem4);
		
		memberHashSet.ShowAllMember();
		
		Member mem5 = new Member(2025, "KILMER");	// id가 같고 이름이 다른 변수 추가
		memberHashSet.addMember(mem5);
		memberHashSet.ShowAllMember();		// id가 중복임에도 불구하고 add허용
											// equals()와 hashcode()를 재정의 해준 후 add반려
		

	}
}
