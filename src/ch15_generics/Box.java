package ch15_generics;
/*
 * 무엇이든 담을 수 있는 상자
 */
public class Box<T> {
	private T ob;

	public void set(T o) {
		ob =o;
		
	}
	
	public T get() {
		return ob;
	}
	
}
