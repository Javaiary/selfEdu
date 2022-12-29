package kr.co.ezenac.game;

public class MasterLevel extends PlayerLevel {
	public MasterLevel() {
		System.out.println("******상급자 레벨입니다.******");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");

	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void run() {
		System.out.println("아주 빨리 달립니다.");
	}

}
