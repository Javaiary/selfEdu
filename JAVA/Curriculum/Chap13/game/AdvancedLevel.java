package kr.co.ezenac.game;

public class AdvancedLevel extends PlayerLevel {
	public AdvancedLevel() {
		System.out.println("******중급자 레벨입니다.******");
	}

	@Override
	public void turn() {
		System.out.println("turn할 수 없습니다.");

	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

}
