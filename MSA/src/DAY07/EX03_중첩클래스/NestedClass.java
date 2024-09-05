package DAY07.EX03_중첩클래스;

public class NestedClass {

	public static void main(String[] args) {
		// 아우터 클래스인A 객체 생성
		A a = new A();
		a.a =10;
		a.b = 20;
		System.out.println("A의 a :" + a.a);
		System.out.println("A의 b :" + a.b);
		a.aMethod();
		
		//이너 클래스인 B객체 생성
		//이너 객체 생성시 아우터 객체를 통해서 샛체를 생성할 수있다.
		A.B b = a.new B();		//내부에 상용된 중첩클래스이기때문에 A를 통해서 들어가야한다.
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x :" + b.x);
		System.out.println("B의 y :" + b.y);
		b.bMethod();
	}

}
