package kr.co.ezenac.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("Tom");
		System.out.println(person);
		//object의 toString이 호출되었지만 오버라이딩 되기 전 주소값 출력
		//override 후 할당해준 name 값 출력
		Class clazz = Class.forName("kr.co.ezenac.clazz.Person");
		
		Person person2= (Person) clazz.newInstance(); //Class 클래스를 Person 클래스로 다운캐스팅
		System.out.println(person2);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = clazz.getConstructor(parameterTypes);
		System.out.println(cons);
		
		Object[] initArgs = {"VAL"};
		Person person3 = (Person) cons.newInstance(initArgs);
		System.out.println(person3);
		
	}
}
