package kr.co.ezenac.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");

		Constructor[] cons = clazz.getConstructors(); // constructor array
		for (Constructor con : cons) {
			System.out.println(con);
		}
		// constructor에 오버로드 되어있는 메서드들 확인 가능
		
		System.out.println();

		Method[] methods = clazz.getMethods();
		for (Method method: methods) {
			System.out.println(method);
		}
	}
}
