package kr.co.ezenac.set;

public class HashSet {
	public static void main(String[] args) {
		
		java.util.HashSet<String> hashSet = new java.util.HashSet<>();
		hashSet.add("이순신");
		hashSet.add("이도");
		hashSet.add("신사임당");
		hashSet.add("세종대왕");
		hashSet.add("세종대왕");
		
		System.out.println(hashSet);

	}
}
