package kr.co.ezenac.set02;

public class Member implements Comparable<Member>{ //comparable 구현해줘야함
	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름

	public Member(int memberId, String memberName) { // 오버로드된 생성자
		// super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	} 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member memberid = (Member)obj;
			if (memberid.memberId == this.memberId) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memberId - member.memberId);	// 오름차순 
													// * -1 : 내림차순
	}
}
