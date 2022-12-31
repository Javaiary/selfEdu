package kr.co.ezenac.interfacee7;

public class MyBookshelfTest {
	public static void main(String[] args) {
		
		Queue bQueue = new MyBookshelf();
		bQueue.enQueue("배포 자동화와 지속적 안도");
		bQueue.enQueue("편견");
		bQueue.enQueue("페스트");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		// remove(0) 이기 때문에 선입선출됨

	}
}
