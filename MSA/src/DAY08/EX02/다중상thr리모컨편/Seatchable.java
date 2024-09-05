package DAY08.EX02.다중상thr리모컨편;

	//검색 인터페이스
public interface Seatchable {
		
	//채널검색
	//검색어에 해당하는 태널번호를 반환
	int channelSearsh(String keyword);
	
	//컨텐츠 검색
	//검색어에 해당하는 컨텥츠 반환
	String[] contentSerch(String keyword);
}
