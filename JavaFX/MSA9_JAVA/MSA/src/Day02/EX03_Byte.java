package Day02;

public class EX03_Byte {
	
	public static void main(String[] args) {
		//byte 는 1byte 범위에서 정수  데이터를 표현
		// 8bits          (0000 0000) : 2^8 :256개
		// 양수와 음수로 나누면 *128 ~ 0 ~ 127 범위로 표현
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 =  0;
		byte var4 =  30;
		byte var5 = (byte) 128;
		
		
		//byte var5 =  128;  
		//int(4) 가 큰 숫자라 강제 형변환 해야함 byte(1)
		
		
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var3 :" + var3);
		System.out.println("var4 :" + var4);
		System.out.println("var5 :" + var5); //overflow
	}
}
