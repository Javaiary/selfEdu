package kr.co.ezenac.interfacee2;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOFf() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨이 0~10 사이에서만 변경될 것으로 프로그래밍함
		if (volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio 볼륨의 최대값은 10입니다.");
			this.volume = MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio 볼륨의 최소값은 0입니다.");
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

}
