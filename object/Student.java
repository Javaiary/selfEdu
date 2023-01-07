package kr.co.ezenac.object;

public class Student implements Cloneable { // clone()메서드를 사용할 수 있도록 cloneable인터페이스 구현
	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { // 오브젝 클래스로 업캐스팅 된 상태
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (this.studentId == stu.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
