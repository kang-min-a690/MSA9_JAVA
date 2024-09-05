package DAY07.EX03_중첩클래스;

/**
 * 중첩 클래스
 */
public class X {

	//인스턴스 이너 클래스
	class Y {
		int value;
		static int value2;
		
		Y(){
			System.out.println("X의 Y객체 생성");
			System.out.println("value2 : " + value2);
		}
		
		void method() {
			System.out.println("Y의 메소드");
		}
		
	}
	
	//static 이너 클래스
	//static 이너 클래스 에서는 static 멤버사용가능
	
	static class Z {
		int value1;
		static int value2;
		
		Z(){
			System.out.println("X의 Z객체 생성");
		}
		
		void method1() {
			System.out.println("Z의 메소드");
		}
		
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
	}
	
	//로컬 클래스
	//메소드 안에 정의한 클래스
	//메소드가 실행돨떄만 사용되는 이너 크래스
	void method( ) {
		//로컬클래스
		class L {
			int value;
			public String velue;
			static int value2;
			
			L() {
				System.out.println("L 객체 생성");
			}
			void method1() {
				System.out.println("L메소드");
			}
			static void method2() {
				System.out.println("L의 static메소드");
			}
		}
		
		L l = new L();
		l.value = 10;
		System.out.println("로컬 클래스의 L의 변수 -" +  l.velue);
		l.method1();
	}

}
