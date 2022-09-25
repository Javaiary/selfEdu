package singletonpatternex;

public class SpeakerTest {
	public static void main(String[] args) {
		SystemSpeaker speaker = SystemSpeaker.getInstance();
		// getInstance() 메소드를 정의할 때 이미 new SystemSpeaker를 해 주었기 때문에
		// new를 중복사용하지 않음
		// 한 번의 new를 사용하기 때문에 메모리 사용을 절감할 수 있음
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();

		//1,1
		System.out.println(speaker.getVolume());
		System.out.println(speaker2.getVolume());

		//8,8
		speaker.setVolume(8);
		System.out.println(speaker.getVolume());
		System.out.println(speaker2.getVolume());
		
		//20, 20
		speaker2.setVolume(20);
		System.out.println(speaker.getVolume());
		System.out.println(speaker2.getVolume());
		// 하나의 인스턴스(동일한 주소값)를 사용하기 때문에 변수 선언시 값이 같아짐.
	}
}
