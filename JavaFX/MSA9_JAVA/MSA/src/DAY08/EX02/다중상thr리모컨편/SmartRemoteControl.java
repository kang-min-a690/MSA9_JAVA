package DAY08.EX02.다중상thr리모컨편;

import DAY07.EX02_인터페이스.RemoteControl;

//인터페이스 다중상속
// pubilc interface 인터페이스명 extends 인터페이스A, 인터페이스B....{}

public interface SmartRemoteControl extends RemoteControl,Microphone {
	
	//터치패드기능
	//-x, y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
}
