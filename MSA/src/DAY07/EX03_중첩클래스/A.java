package DAY07.EX03_중첩클래스;

//아우터 클래스
public class A {
	
	int a, b;
	
	//이너 클래스
	class B {
		int x, y ;
	
		public void bMethod() {
			System.out.println("이너클래스에서 아우터 클래스의 멤머 접근가능");
			System.out.println("A의 a : " + a);         //int 로 선언된 ab 접근가능
			System.out.println("A 의 b : " + b);
		}
	}
	
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		//(에러) System.out.println("B의 x : " + x);		//int 로 선언된 ab 접근 불가능
		//(에러) System.out.println("B의 y : " + y);
		
	}
}
