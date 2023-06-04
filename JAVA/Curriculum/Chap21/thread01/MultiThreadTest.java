package thread01;

/**
 * 여러 개의 스레드 동시 실행 - 20 미만 짝수 출력 - 10 미만 수 출력
 */
public class MultiThreadTest {
	public static void main(String[] args) {
		//스레드1,2 실행 도중에 메인스레드가 완료되지 않도록 sleep()을 사용해서 멈춰줌
		Runnable task1 = () -> {
			for (int i = 0; i < 20; i++ ) //(or i = i+2) 
				{if(i%2==0) {
					System.out.println("(" + i + ") ");
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		};
		Runnable task2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i );
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
	}
}
