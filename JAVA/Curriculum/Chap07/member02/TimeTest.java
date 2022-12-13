package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		//time.setHour(-20);
		time.setHour(10);
		//System.out.println(time.getHour());
		
		time.setMinute(25);
		time.setSecond(55);
		
		System.out.println(time.toString());
		
		time.setHour(55);
		time.setMinute(70);
		time.setSecond(-55);
		
		System.out.println(time.toString());
	}

}
