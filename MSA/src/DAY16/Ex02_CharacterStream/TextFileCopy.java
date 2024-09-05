package DAY16.Ex02_CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
	
	public static void main(String[] args) {
		//Test.txt ㅍㅏ일을 Test2.txt파일로 복사
		// 1.Test.txt 파일 입력
		// 2.Test2.txt 파일 출력
		
		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			//경로는 프로젝트 기본 경로로잡는다.
			// 프로젝트 경로 C:/~/~/Java
			//  (./)는 현재 폴더 경로를 가르킨다(디텍토리)
			//  ./src/DAY16/Test.txt == C:/~/~/Java/src/DAY16/Test.txt  같은말
			
			fr = new FileReader("./src/DAY16/Test.txt");		//파일 입력 문자스트림
			fw = new FileWriter("./src/DAY16/Test2.txt");		//파일 출력 문자스트림
			
			//파일 입력
			while( (data = fr.read()) != -1 ) {		//-1이 된순간 반복을 멈춘다.
				//파일 출력
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일이 복사되었다.");
			System.out.println("Test.txt -> Test2.txt ");
		} catch (IOException e) {
			System.err.println("입/출력시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}

}
