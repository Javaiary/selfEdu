package kr.co.ezenac.game;

public class BeginnerLevel extends PlayerLevel {
	public BeginnerLevel() {
		System.out.println("******초급자 레벨입니다.******");
	}

	@Override
	public void turn() {
		System.out.println("turn할 수 없습니다.");

	}

	@Override
	public void jump() {
		System.out.println("jump할 수 없습니다.");
	}

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

}
