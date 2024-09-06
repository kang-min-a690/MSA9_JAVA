package Day06.EX05_StaticMember;

public class StaticMember {
	
	//static 변수
	static int a;
	static int b;
	//인스턴스 변수
	int c;
	static final double PI = 3.141592;
	
	//static 메소드
	public static int sum(int x, int y) {
		int sum =a+b+x+y;
		
		
		//**sum += c;
		//c는 static 변수가 아니고 인스턴스 변수 이기 때문에
		//개체 생성시 메모리에 할당 되므로,static 메소드가 항당되는 시점에서는 접근할 수 없다.
		//그래서 static 메소드 에서는 인스턴스 멤버를 접근할수 없다.
		
		return sum;
		
	}
	
	public static void main(String[] arg) {
		//static 메소드는 객체 생성없이 호출 가능하다.
		int sum =sum(10,20);
		a = 100;
		
		//객체 (인스턴스) 생성
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		int a1 = s1.a;
		int c1 = s1.c = 10;
		int a2 = s2.a;
		int c2 = s2.c = 20;
		
		//PI = 100;
		//final은 상수로 지정하는 키워드
		//한번 값을 초기화한 이후에는 값을 변경 할 수 없다.
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
	}
}
