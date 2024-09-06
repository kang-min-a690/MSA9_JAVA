package DAY08.EX02.다중상thr리모컨편;

public interface Microphone {

		int inputVolumeMax = 50;		//음성인식 최대볼륨
		int inputVolumeMin = 0;			//음성인식 최소
		
		//음성인식
		String receiveVoice(String voice);
}
