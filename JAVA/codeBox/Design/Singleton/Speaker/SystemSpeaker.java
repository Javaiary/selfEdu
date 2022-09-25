package singletonpatternex;

public class SystemSpeaker {
	private static SystemSpeaker instance; 
	// 하나의 인스턴스만 허용하기 위해서 외부접근비허용(private) 중복방지(static) 선언
	private int volume;
	private SystemSpeaker() {
		// 외부에서 생성자 호출 비허용(private)
		volume = 1;
	}
	
	public static SystemSpeaker getInstance() {
		if (instance ==null) {
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		}
		else
			System.out.println("이미 생성");
		return instance;
	}
/*
	 외부에서 instance를 사용하기 위해서 getInstance 생성
	 instance 선언만 하고 초기화를 해주지 않았기 때문에 초기화 필요
	 instance가 null 인지 확인 후, null이라면 생성
	 instance가 null 일 경우, 새로운 를 생성하여 instance를 반환하고,
	 instance가 null 이 아닐 경우(이미 호출 되어 생성된 적이 있을 경우),
	 이미 생성되어 있는 instance를 그대로 반환
*/	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
