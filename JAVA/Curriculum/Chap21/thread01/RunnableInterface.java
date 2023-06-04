package thread01;

public class RunnableInterface {
	public static void main(String[] args) {
		
		//Runnable 타입의 변수 task에 람다식을 대입함 () -> {}
		Runnable task = () -> {
			try {
				Thread.sleep(3000);	// 스레드의 실행이 3초간 일시정지 후 다시 진행됨(단위: millisecond)
			} catch (InterruptedException e) {}
			
			int sum = 0;
			for(int i =1; i <=10; i++)
				sum+=i;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + sum);
		};
		Thread thread = new Thread(task);
		thread.start();
		
		
		System.out.println("main: " + Thread.currentThread().getName());
	}
}
