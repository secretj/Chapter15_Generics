package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		// 사과 상자 생성
		Box<Apple> aBox = new Box();
		//오렌지 상자 생성
		Box<Orange> oBox =new Box();
		
		
		//상자에 과일 담기
		aBox.set(new Apple());
		
		oBox.set(new Orange());


	
		//상자에서 과일 꺼내기
		Apple ap = aBox.get();       	//그냥 오브젝트로 객체를 꺼내와도 다 꺼내올수있는데 굳이 애플로 꺼내는이유가 뭔지
		Orange or = oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	
	
	}
}
