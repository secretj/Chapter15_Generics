package ch15_generics;
/*
 * �����̵� ���� �� �ִ� ����
 */
public class Box<T> {		//Ÿ���� �������༭ ������������ �����ʾƵ��ȴ�( ���׸�)
	private T ob;

	public void set(T o) {
		ob =o;
		
	}
	
	public T get() {
		return ob;
	}
	
}
