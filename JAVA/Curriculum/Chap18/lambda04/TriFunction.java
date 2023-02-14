package kr.co.ezenac.lambda04;

@FunctionalInterface	//선언 없을 때는 여러개 함수 넣을 수 있음 !ㅎ ㅎ

public interface TriFunction<T, U, V, R> {//input 3개 + R (리턴타입 제너릭)
	R apply (T t, U u, V v);
}
