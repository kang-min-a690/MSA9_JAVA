package DAY10_13.EX01_Lang;

import java.util.Scanner;

public class String글자뽑아내기 {
	
	public static void main(String[] args) {
		String str1 = " TheJoEun Academy";
		String str2 = " theJoEun Academy";
		
		System.out.println( str1.charAt(2));				//index 2 번째 글자
		System.out.println( str1.concat(str2));				//문자열 연결
		System.out.println( str1.contains(str2));			// 문자열 포함 여부 (f/t)
		System.out.println( str1.equals(str2));				//문자열 일치 여부 (f/t)
		System.out.println( str1.equalsIgnoreCase(str2));	//대소문자 구분 없이 일치여부 (f/t)
		System.out.println( str1.indexOf("A"));				//해당 문자의 첫 index반환, 없으면 -1
		System.out.println( str1.lastIndexOf("e"));			 //해당 문자의 마지막 index반환, 없으면 -1
		System.out.println( str1.trim());					// 문자열 양쪽 공백제거
		System.out.println( str1.length());					// 문자열 길이(글자수)[공백포함]
		System.out.println( str1.substring(10)); 			//1index 앞의 문자열을 자르고, 뒤의 문자열 반환
		System.out.println( str1.substring(10, 17));		//index~(index2-1) 까지 반환
															//index 10번째 부터 16번째 가지의 문자열을 가져온다
															// academy
															//[10] ~[16]
		
		// split ("구분자")			:(구분자)를 기준으로 문자열을 잘라서 배열로 반환
		String[] sp = str1.split("");		//""(빈 문자열)을 기준으로 하면, 한글자 씩 배열요소 반환
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + " : \t" + sp[i]);
		}
		System.out.println();
		
		
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//String/split (정규표현식)
		//정규 표현식에서 + 기호는 산술연산자가 아닌 다른의미로 사용
		// 산술 연산자 +로 구분하려면 앞에 \\ 기호를 붙여 주어야한다.
		
		Scanner sc = new Scanner(System.in);
		//String cal = "10+20";
		String cal = sc.nextLine();
		String[] num = cal.split("\\+");
		
		if(cal.contains("+")) {
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			
			int result =  a + b;
			System.out.println(result);
		}
		
		System.out.println("피연산자1 : " + num[0]); 
		System.out.println("피연산자2 : " + num[1]); 
		
		sc.close();
		
	}

}
