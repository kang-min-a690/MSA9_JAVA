package DAY16.Ex02_CharacterStream;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputReaderAndFileWriter {
	
	public static void main(String[] args) {
		//키보드로 입력한 텍스트를 파일로 저장
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = null;
		
		int data = 0;
		try {
			fw = new FileWriter("./src/DAY16/Test.txt");
			//입력
			//? : 입력은 언제 멈추나?
			// A : End-of-file(EOF) 를 나타내는 기호가 입력됐을때, 입력이 종료된다.
			// 윈도우에서는 ctrl + Z 를 입력시 EOF 가 입력되어 입력종료를 알린다.
			while ( (data = isr.read() ) != -1 ) { //ctrl+Z를 누르면 -1; -1이 된순간 반복을 멈추게된다.
				//출력
				fw.write(data);
			}
			isr.close();
			fw.close();
			System.out.println("텍스트 파일이 저장되었습니다.");
		} catch (Exception e) {
			System.err.println("입출력시 , 에러가 발생했습니다");
			e.printStackTrace();
		}
		
	}

}
