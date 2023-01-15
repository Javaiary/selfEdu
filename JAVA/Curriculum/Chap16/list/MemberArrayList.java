package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> arrayList; // AL에 Member만 넣을 수 있음

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {
//		// 해당 아이디를 가진 멤버를 ArrayList에서 찾아서 삭제
//		for (int i = 0; i<arrayList.size(); i++ ) {
//			Member member = arrayList.get(i);
//			//멤버아이디가 매개변수 memberId와 일치하면 삭제
//			int tempId = member.getMemberId();
//			if (tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//				
//			}
//		}
		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;

	}

	public void showAllMembers() {
		for (Member member : arrayList)
			System.out.println(member);
		System.out.println();
	}
}
