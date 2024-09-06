package DAY08.EX01_익명자식객체생성;

public class rc카주행테스트 {
	
	public static void main(String[] args) {
		
		//익명 구현객체
		// 클래스를 정의하지않고도 이름업ㄱ이 구현한 객체
		//인터페이스 객체명 = new 인처페이스(인자1,.....) {객체정의}
		
		RemoteControl rc = new RemoteControl() {
			int speed = 0;
			
			@Override
			public void turnOn() {
				System.out.println("ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
				
			}
			
			@Override
			public void setSpeed(int speed) {
				this.speed = speed;
				System.out.println("속도 : " +this.speed);
				
			}
		};
		
		rc.turnOn();
		rc.setSpeed(50);
		rc.turnOff();
	}

}
