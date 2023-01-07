package kr.co.ezenac.object;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student studnet1 = new Student(2022, "VAL");
		Student student2 = new Student(2022, "VAL");
		
		//clone() 메서드 ------
		Student student3 = (Student)studnet1.clone();
		
		System.out.println(studnet1==student2);	//주소가 다르기 때문에 false 출력
		System.out.println(studnet1.equals(student2));//주소가 다르기 때문에 false 출력
													  //override후 true 출력
		System.out.println();
		System.out.println(studnet1==student3);		//false
		System.out.println(studnet1.equals(student3));//true
		
		System.out.println(studnet1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());

		System.out.println();
		//String class ----------------------------
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); //String 클래스에서 값이 같으면 true 출력
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());	// hash값도 동일
		
		System.out.println();
		//Integer class-----------------------------
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); 	  //Integer 클래스에서 값이 같으면 true 출력
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());	  // hash값도 동일
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}
}
