package DAY07.EX02_인터페이스;

//인터페이스를 구현하는 키워드 implements
public class Drone implements RemoteControl {
	
	int speed; //변수 지정
	
	
	//리모트컨트롤러 오버라이딩
	@Override
	public void trunOn() {
		System.out.println("드론 전원 킨다");
		
	}

	@Override
	public void trunOff() {
		System.out.println("드론 전원 킨다");
		
	}

	@Override
	public void setSpeed(int speed) {
		if(speed > MAX_SPEED ) {          //리모트 컨트롤을 상속받았기때문에 안써도 됨.
			this.speed = MAX_SPEED;
			System.out.println("최대 속력");
		}
		else if (speed < MIN_SPEED) {
			this.speed = MIN_SPEED;
			System.out.println("최저 속력");
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : "+ this.speed);
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
