package DAY16.Ex02_CharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderEx {
	
	public static void main(String[] args) {
		//파일경로
		String filePath = "sample.txt";
		
		
		try(
			//FileReader 파일을 문자단위로 입ㄹ력
			FileReader fr = new FileReader(filePath);
				
			//BufferedReader 파이 데이터 입력성능 향상
			BufferedReader br = new BufferedReader(fr);
		) {
			String text;
			// LeadLine() : 파일의 문자 데이터르 한줄씩 입력
			// 데이터가 더이상 없으면 null반환
			
			while( (text = br.readLine() ) !=null ) {
				System.out.println(text);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
