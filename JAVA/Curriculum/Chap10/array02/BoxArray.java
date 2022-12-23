package kr.co.ezenac.array02;

class BoxA4{
	public String name;

	public BoxA4(String name) {
		super();
		this.name = name;
	}
	
	
}

public class BoxArray {
	
	public static void main(String[] args) {
		
		BoxA4[] arr = new BoxA4[3];
		//배열에 객체 저장(초기화)
		arr[0] = new BoxA4("Eden");
		arr[1] = new BoxA4("Eden2");
		arr[2] = new BoxA4("Eden3");
		
		//저장된 객체를 참조하여 값을 확인
		System.out.println(arr[0].name); //public으로 정의했기 때문에 접근가능
		System.out.println(arr[1].name);
		System.out.println(arr[2].name);
				
	}

}
