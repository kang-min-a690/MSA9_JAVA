// 리모콘만드는 클래스에요
package DAY07.EX02_인터페이스;

public class Driver {
	
	public static void main(String[] args) {
		//인터페이스를 구현한 클래스 객체를 만드는 법
		//인터페이스타입 객체명 = new 구현 글래스();
		
		//RC카
		RemoteControl carRC = new RcCar();
		carRC.trunOn();			//시동걸기
		carRC.parking(false);	//주행모드
		carRC.setSpeed(20);		//가속
		carRC.parking(true);	//주차
		carRC.trunOff();		//시동끄기
		System.out.println();
		
		//static메소드는 객체 생성없이도 바로 호출 가능
		RemoteControl.changeBatter();	//배터리교체
		System.out.println();
		
		//드론
		RemoteControl droneRC = new Drone();
		droneRC.trunOn();
		// 디폴트 메소드는 구현 하지 않아도 (오버라이딩) 바로 호출 가능
		droneRC.parking(false);
		droneRC.setSpeed(15);
		droneRC.parking(true);
		droneRC.trunOff();
		System.out.println();
		
	}

}
