package DAY08.디자인패턴;

public class SingleTonTest {

	public static void main(String[] args) {
		//SingleTon singleTon = new SingleTon();   이렇게 시작못함
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		//인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
		System.out.println("s01과 s02가 같은지 여부");
		System.out.println( s01 == s02 );
	}
}
