package kr.co.ezenac.singleton02;

/*	* 자동차 공장이 있습니다.
 * 	  자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 생산될 때마다 고유의 차번호가 부여됩니다.
 * 	  자동자 번호가 1001부터 시작되어 차가 생산될 때마다 1002, 1003 번호가 부여되도록
 * 	  자동차 공장 클래스(싱글톤 패턴), 자동차 클래스(static 변수)를 구현하시오.
 * 
 *  객체를 구현하여 실행 결과가 아래처럼 나오도록 구현하시오.
 *    
 *  
 */
public class Car {
	
	public static int serialNum = 1000;
	private int carNum;
	
	public Car() {
		serialNum++;	//car()생성자가 호출될 때마다 시리얼넘버 증가
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
		
}
	

