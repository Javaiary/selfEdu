package kr.co.ezenac.interfacee2;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOFf() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV 볼륨의 최대값은 10입니다.");
			this.volume = MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV 볼륨의 최소값은 0입니다.");
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

}
