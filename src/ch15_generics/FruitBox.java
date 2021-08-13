package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		// ��� ���� ����
		AppleBox aBox = new AppleBox();
		//������ ���� ����
		OrangeBox oBox =new OrangeBox();
		
		
		//���ڿ� ���� ���
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		
		//���ڿ��� ���� ������
		Apple ap = aBox.get();
		Orange or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	
	
	}
}
