package DAY08.EX01_익명자식객체생성;

public interface RemoteControl {
	
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	default void Parking(boolean check) {
		if(check ) {
			System.out.println("주차");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행");
			setSpeed(MAX_SPEED);
		}
	}
	
	static void ChangeBetter() {
	System.out.print("배터리교체");
	
	}

}
