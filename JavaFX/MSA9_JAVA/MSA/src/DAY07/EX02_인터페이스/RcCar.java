//자식클래스에요
package DAY07.EX02_인터페이스;

//클래스를 상속하는키워드 extrnds
//인터페이스를 구현하는 키워드 implements
public class RcCar implements RemoteControl {
	
	int speed;	
	
	@Override 
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 켰다");
		
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 끈다");
	}

	@Override
	public void setSpeed(int speed) {
		// 최대 속력 초과하지 못하게 지정
		if(speed > RemoteControl.MAX_SPEED ) {
			this.speed = RemoteControl.MAX_SPEED;
		}
		//최저 속력 미만이되지 않도록 지정
		else if( speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
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
