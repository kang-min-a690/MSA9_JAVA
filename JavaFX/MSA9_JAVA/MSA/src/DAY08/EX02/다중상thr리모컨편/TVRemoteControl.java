package DAY08.EX02.다중상thr리모컨편;

public interface TVRemoteControl {
	
	int MAX_VOLUMEN = 300;
	int MIN_VOLUMEN = 0;
	
	void turnOn();
	void turnOff();
	void setVolumen(int volume);
	void setChannel(int channel);
	
	default void setMute(boolean mute) {
		if(mute ) {
			System.out.println("음소거 설정되었음");
			setVolumen(MIN_VOLUMEN);
		}
		else {
			System.out.println("음소거 해제");
			setVolumen(10);
		}
	}
	
	static void ChangeBetter() {
	System.out.print("배터리교체");
	
	}

}
