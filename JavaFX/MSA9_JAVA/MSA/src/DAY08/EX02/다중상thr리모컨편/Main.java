package DAY08.EX02.다중상thr리모컨편;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		SmartTv tv = new SmartTv();
		
		tv.trunOn();
		tv.setVolume(20);
		int channel = tv.channelSearsh("SBS");
		tv.setSpeed(channel);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 컨텐츠 : ");
		String keyworrd = sc.nextLine();
		String[] content = tv.contentSerch(keyworrd);
		
		for (int i = 0; i < content.length; i++) {
			System.out.println(content[i]);
			if( i < content.length - 1)
				System.out.print(" , ");
			
		}
		System.out.println();
		tv.receiveVoice("뉴스 틀어줘");
		
		tv.trunOff();
		sc.close();
	
	
	}

}
