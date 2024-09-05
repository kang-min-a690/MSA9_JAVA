package DAY10_13.EX01_Lang;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		//StringBuilder		:문자열을 변경할수 있는 클래스
		//StringBuilder		:멀티 스레드 환정에서 동기화x
		//StringBuffer		:멀티 스레드 환정에서 동기화o
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("더조은");
		sb.append("아카데미");
		System.out.println(sb);
		
		sb.insert(7, "학원");
		System.out.println(sb);
		
		sb.setCharAt(0, 'T');
		System.out.println(sb);
		
		sb.replace(1, 3, "heJoEun");
		System.out.println(sb);
		
		sb.delete(0, 8);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("글자수 : " + length);
	}

}
