package ch15_generics;
/*
 * 무엇이든 담을 수 있는 상자
 */
public class Box<T> {		//타입을 지정해줘서 강제형변형을 하지않아도된다( 제네릭)
	private T ob;

	public void set(T o) {
		ob =o;
		
	}
	
	public T get() {
		return ob;
	}
	
}
