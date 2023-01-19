package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashmap;	//has-a
	
	public MemberHashMap() {
		hashmap = new HashMap<>();
	}
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(), member);
		
	}
	// containsKey / containsValue : Map 안에 특정 Key, Value 들었는지 확인
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
			hashmap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {	
		Iterator<Integer> iterator = hashmap.keySet().iterator();
							// keySet() : map에 저장되어있는 키 반환
		while(iterator.hasNext()) {
			int key = iterator.next();			//.next() 다음 요소 반환
			Member member = hashmap.get(key);
			System.out.println(member);
		}
	}
}
