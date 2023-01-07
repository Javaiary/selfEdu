package kr.co.ezenac.string;

public class StringTest02 {
	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");
		System.out.println(System.identityHashCode(java));
		System.out.println(System.identityHashCode(sql));
		
		java = java.concat(sql);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		// 기존 java의 주소에 값이 들어간 것이 아니라 새로운 주소에 concat된 값 할당
	}
}
