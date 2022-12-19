package kr.co.ezenac.goingtoschoolloop;

public class GoingToSchool {
	public static void main(String[] args) {
		Student student = new Student("박명수", 80000);
		Student student2 = new Student("노홍철", 50000);
		
		Bus bus100 = new Bus(100);
		Subway subway9 = new Subway(9);
		
		student.takeBus(bus100);
		student2.takeSubway(subway9);
		
		student.showInfo();
		student2.showInfo();
		
		bus100.showInfo();
		subway9.showInfo();
	}
}
