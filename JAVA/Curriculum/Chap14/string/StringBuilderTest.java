package kr.co.ezenac.string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");
		
		StringBuilder buffer = new StringBuilder(java);
		//StringBuffer
		System.out.println(System.identityHashCode(buffer));
		buffer.append(sql);
		System.out.println(System.identityHashCode(buffer));
		//새로운 인스턴스 생성이 아니라 같은 주소에 할당
		
		System.out.println(buffer);
		

	}
}
