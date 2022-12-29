package kr.co.ezenac.game;

public abstract class PlayerLevel {
	
	
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	public abstract void turn();

	public abstract void jump();

	public abstract void run();
}
