
package kr.co.ezenac.object;
/*
 *  날짜를 구현한 클래스 MyDate가 있습니다.
 *  날짜가 같으면 equals()메서드 결과가 true가 되도록 구현하시오.  *equals 오버라이드
 *  
 *  hashCode()메서드도 구현해 보시오.
 *  
 */

class MyDate {
	protected int day;
	protected int month;
	protected int year;

	public MyDate(int dd, int mm, int yyyy) { // 객체 초기화
		this.day = dd;
		this.month = mm;
		this.year = yyyy;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate myDate = (MyDate) obj;
			// object로 업캐스팅된 것을 다운캐스팅 해줌
			// 업캐스팅 되어있으면 자식클래스의 멤버변수를 확인할 수 없기 때문
			if (myDate.day == this.day && myDate.month == this.month && myDate.year == this.year)
				return true;
			else
				return false; // 매개변수(obj)가 MyDate타입이 아닐 경우 진입 불가, false반환
		}

		return false;
	}
	// day, month, year 가 모두 같으면 true를 반환

	@Override
	public int hashCode() {
		return this.year * 10000 + this.month * 100 + this.day;
	}
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(5, 9, 2022);
		MyDate date2 = new MyDate(5, 9, 2022);

		System.out.println(date1.equals(date2)); // 두 변수를 비교한 값이 true가 나오도록 하시오.

		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());

	}
}
