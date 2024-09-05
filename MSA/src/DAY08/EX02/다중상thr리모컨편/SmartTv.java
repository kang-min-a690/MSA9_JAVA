package DAY08.EX02.다중상thr리모컨편;

import java.text.MessageFormat;

//다중구현
//public class 클래스명 implements 인터페이스 A , 인터페이스 B...{}
public class SmartTv implements SmartRemoteControl, Seatchable {
	
	int volume; 	//볼륨
	int channel;	//채널
	String keyword;
	int x,y;		//터치패드
	
	
	@Override
	public void trunOn() {
		System.out.println("전원 ON");
		
	}
	@Override
	public void trunOff() {
		System.out.println("전원 OFF");
		
	}
	
	//오류나서 해결해야함;;
	//@Override
	//public void setChannel (int channel) {
	//	this.channel = channel;
	//	System.out.println("channel : " + channel);
		
	//}
	
	
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : " + volume);
		
		
	}
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성입력 : " + voice);
		return "voice : " + voice;
	}
	@Override
	public int channelSearsh(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS": channel = 5;	break;
		case "KBS": channel = 7;	break;
		case "MBC": channel = 11;	break;
		case "Mnet": channel = 27;	break;
		case "ENE": channel = 30;	break;
		case "투니버스": channel = 51;	break;
		}
		return channel;
	}
	@Override
	public String[] contentSerch(String keyword) {
		String[] movieContents = {"아이언맨","타짜","인셉션","데드풀","반지의 제왕","미드소마"};
		String[] idolContents = {"에스파","아이브","뉴진스","최애의 아이","소녀시대","H.O.T"};
		String[] recommendContents = {"메타 코미디 클럽", "경영자들", "피식대학","먹방"};
		String[] choiceContents;
		
		switch(keyword) {
			case "영화" : 
				choiceContents = movieContents;
				break;
			case "아이돌" : 
				choiceContents = idolContents;
				break;
			default:
				choiceContents = recommendContents;
				break;
		}
		return choiceContents;
	}
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) : " + MessageFormat.format("({},{})", x,y));
		//System.out.println("(x,y) : " + "");
		
	}
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		
	}

	
		
	} 