package DAY07.EX02_인터페이스;

public interface RemoteControl {
	
	//상수
	//최저 속력, 최고 속력 상수를 선언
	// * 인터 페이스는 변수 선언시 (public static final)이 자동으로 선언
	
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	//추상메소드
	//(public abstract)가 자동 선언  
	// public 써도되고 안써도 된다는 뜻
	void trunOn();
	void trunOff();
	void setSpeed(int speed);
	
	//디폴트 메소드
	//구현한 객체가 기본으로 사용할 수 있는 메소드
	// 자식클래스에 디폴트메소드를 오버라이딩 하지않아도 바로 호출해서 사용가능
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차 해유");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("저 가유");
			setSpeed(10);
		}
	}
	
	//static 메소드 (실행할때 가장먼저 고정하는 키워드)
	//구현객체가 없어도 인터페이스만 으로 호출이 가능한 메소드
	//rc 카가 없어도 리모콘 배터리를 교체할수 있는것처럼..
	static void changeBatter() {
		System.out.println("배터리 교체해유");
	}
	void setVolume(int volume);
}
