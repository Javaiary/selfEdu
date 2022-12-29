package kr.co.ezenac.game;
/*
 *  상속이 제한되는 final
 *  	1) 변수
 *  		- final 변수는 상수를 의미함.
 *  	2) 메서드
 *  		- final 메서드는 하위 클래스에서 오버라이딩을 할 수 없음
 *  	3) 클래스
 *  		- final 클래스는 상속을 할 수 없음
 *  
 */
public class Player {
	
	private PlayerLevel level;	// has-a 관계
	public Player() {
		level = new BeginnerLevel();
//		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	public PlayerLevel upgradeLevel(PlayerLevel level) { 
		//PlayerLevel 만 올 수 있음(다형성)
		this.level = level;
//		level.showLevelMessage();
		return this.level;
	}
	public void play(int count) {
		level.go(count);
	}
}
