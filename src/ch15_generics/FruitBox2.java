package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		// ��� ���� ����
		Box<Apple> aBox = new Box();
		//������ ���� ����
		Box<Orange> oBox =new Box();
		
		
		//���ڿ� ���� ���
		aBox.set(new Apple());
		
		oBox.set(new Orange());


		//���ڿ��� ���� ������
		Apple ap = aBox.get();       	//�׳� ������Ʈ�� ��ü�� �����͵� �� �����ü��ִµ� ���� ���÷� ������������ ����
		Orange or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	
	
	}
}
