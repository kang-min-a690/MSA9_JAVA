package DAY07.EX03_중첩클래스;

public class NestedClass2 {
	
	public static void main(String[] args) {
		//X
		//-Y : 인스턴스 이너 클래스
		//-Z :static 이너 클래스
		//* method - L :로컬클래스
		
		X x= new X();
		
		//인스턴스 이너 클래스 객체 생성
		X.Y y = x.new Y();
		y.value = 10;
		System.out.println("Y 객체의 변수 :" + y.value);
		y.method();
		
		//static 이너 클래스 객체 생성
		X.Z z = new X.Z();
		z.value1 = 20;
		System.out.println("X의Z객체 변수 :" + z.value1);
		
		//Z클래스 작성없이 바로 노출
		X.Z.value2 = 30;
		System.out.println("X의 Z 객체의 static변수:" + X.Z.value2);
		z.method1();	//일반 메소드
		X.Z.method2();	//static 메소드
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		x.method();		//내부에서 L객체 생성
	}

}
