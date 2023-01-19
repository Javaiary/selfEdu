package kr.co.ezenac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
	
		map.put("lee", 95);
		map.put("val", 90);
		map.put("dang", 80);
		map.put("val", 95);		//key값 중복(String)
		map.put("jon", 95);
		
		System.out.println("사이즈 : " + map.size());
		System.out.println("값 : " + map.get("val"));	//중복일 경우 마지막 값이 저장
		System.out.println();
		
		//map 컬렉션이 제공하는 메서드를 이용하여 key값만 Set계열로 바꿈/ keySet() : key값 반환
		Set<String> set =  map.keySet();
		Iterator<String> iterator =  set.iterator();
		while (iterator.hasNext()) {
			String key= iterator.next();
			Integer value = map.get(key);			// keySet().get() 으로 value를 가져옴
			System.out.println(key + ":" + value);
		}
		System.out.println();
		
		//map 컬렉션의 Map.Entry 객체를 대상으로 Set 계열로 바꿈
//		Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		//위 두 줄을 한줄로 표시
		Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); 		//key값 얻음
			int value = entry.getValue();		//value값을 얻음
			System.out.println(key + ":" + value);

		}
		
		//전체 객체 삭제
		map.clear();
		System.out.println("사이즈 : " + map.size());
	
	
	}
}
