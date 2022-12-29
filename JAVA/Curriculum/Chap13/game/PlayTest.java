package kr.co.ezenac.game;

public class PlayTest {

	public static void main(String[] args) {
		
		//play 구현 X
//		PlayerLevel bgn = new BeginnerLevel();
//		bgn.go(1);
//		System.out.println();
//
//		PlayerLevel adv = new AdvancedLevel();
//		adv.go(2);
//		System.out.println();
//
//		PlayerLevel mst = new MasterLevel();
//		mst.go(3);
//		System.out.println();

		
		Player player = new Player();
		player.play(1);
		
		PlayerLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		PlayerLevel mlevel = new MasterLevel();
		player.upgradeLevel(mlevel);
		player.play(3);
	}
}
