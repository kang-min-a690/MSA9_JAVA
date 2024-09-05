package DAY16.Ex03_File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class FileManager {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menuNo;		//메뉴번호
		
		do { //do While 시작
			menu();	//메뉴판 출력
			
			menuNo = sc.nextInt();//메뉴번호입력
			sc.nextLine();
			
			if( menuNo == 0) break;
			
			//파일 경로입력
			System.out.println("파일 경로 : ");
			String filePath = sc.nextLine();
			
			//메뉴선택
			switch (menuNo) {
			case 1://디렉토리 생성
				makeDirectory(filePath);
				break;
			case 2://디렉토리 파일목록
				listDirectory(filePath);
				break;
			case 3://파일정보조회
				fileInfo(filePath);
				break;
			case 4://파일삭제
				deleteFile(filePath);
				break;
			case 5://폴더 삭제
				deleteDirectory(filePath);
				break;

			}
		} while (true);  //do While 끝
		
		
	}

	/**
	 * 메뉴 출력메소드
	 */
	private static void menu() {
	System.out.println("************파일관리***************");
	System.out.println("1.폴더 생성");
	System.out.println("2.폴더 파일목록");
	System.out.println("3.파일정보 조회");
	System.out.println("4.파일 삭제");
	System.out.println("5.폴더 삭제");
	System.out.println("0.종료");
	System.out.println("***********번호 :");
	}
	
	/**
	 *  폴더생성
	 * @param filePath
	 */
	private static void makeDirectory(String filePath) {
		// 파일 객체 생성 방법
		//1. File 객체명 = new File(파일경로);
		//2. File 객체명 = new File(폴더경로, 파일명);
		File file = new File( filePath );
		
		//폴더 생성
		//mkdir()	:생성할 경로의 상위 경로까지 기존 디렉토리가 존재 해야한다.
		//mkdirs()	:생성할 경로의 상위 경로까지 디렉토리를 생성해 준다
		if( file.mkdirs() ) {		//ture
			System.out.println("디렉토리 성공");
		}
		else {						//false
			System.err.println("디렉토리 실패");
		}
		System.out.println("경로 : " + filePath);
		
	}
	
	
	/**
	 * 폴더 내의 파일 목록
	 * @param filePath
	 */
	
	private static void listDirectory(String filePath) {
		System.out.println(filePath);
		System.out.println("---------------------------------------------");
		File file = new File(filePath);
		File[] fileList = file.listFiles();		//하위 경로의 파일목록을 File 배열로 반환
		
		
		System.out.println("파일명\t\t용량\t\t수정일자");
		for (File subFile : fileList) {
			long update = subFile.lastModified();
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updataDate = sdf.format(date);
			
			System.out.println( subFile.getName() + "\t\t");
			System.out.println( subFile.length() + "\t\t");
			System.out.println( updataDate + "\t\t");
		}
		System.out.println("-------------------------------------------------");
		
 	}
	
	/**
	 * 파일 정보를 조회
	 * @param filePath
	 */
	
	private static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.println("파일 종류 : ");
		if( file.isDirectory() ) System.out.println("디렉토리");//디렉토리이면true
		if( file.isFile() ) System.out.println("일반파일"); //파일이면true
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		
		System.out.println( file.getName() + "\t\t");
		System.out.println( file.length() + "\t\t");
		System.out.println( updateDate + "\t\t");
		System.out.println();	
	}
	
	/**
	 * 파일 삭제
	 * @param filePath
	 */
	
	private static void deleteFile(String filePath) {
		File file = new File(filePath);
		
		//파일 존재 여부 확인
		if ( file.exists() ) 
			//delete()
			//파일 삭제 성공 --> ture
			// 삭제 실패	--> false
			// 하위 경로에 파일이 존재하면 삭제가 되지않는다.
			if( file.delete() ) {
				System.out.println("파일 삭제 성공");
			}
			else {
				System.err.println("삭제 실패");
			}
		else {
			System.err.println("파일이 존재하지 않습니다.");
		}
		
	}
	
	/**
	 * 폴더 삭제
	 * @param filePath
	 */
	
	
	private static void deleteDirectory(String filePath) {
		File file = new File(filePath);
		File[] fileList = file.listFiles(); 	//하위 파일 목록
		
		//하위 경로에 파일이 있으면 하위 파일을 먼저삭제
		if( fileList != null ) {
			//하위 경로의 파일들을 삭제
			for (File subFile : fileList) {
				
				//재귀 호출( 재귀함수 : recursive)
				//자기 자신을 호출하는 함수
				deleteDirectory( subFile.getPath());
			}
		}
		
		//폴더(파일) 삭제
		if( file.delete() ) {
			System.out.println("폴더 (파일) 삭제 성공");
		}
		else {
			System.out.println("폴더 (파일) 삭제 실패");
		}
	}


}
