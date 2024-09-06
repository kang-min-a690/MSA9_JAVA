package DAY10_13.EX02_Util;

import java.util.Random;

public class RandomEx_주사위 {
	
			public static void main(String[] args) {
				
				Random random = new Random();    	//새로운 인스턴스를 초기화 해서 랜덤값을 생성하는데 사용
				
				// 동전 던지기
				// true/fleas 로 구분 지으니까 TF
				//랜덤한 boolean 값(true 또는 false)을 생성하여 동전 던지기를 시뮬레이션, 이후 동전이 앞 or뒤인지 출력 
				boolean randomTF = random.nextBoolean();
				System.out.println("동전 앞 뒤 : "+ randomTF);
				
				// 값이 ture면 앞면 출력, fleas면 뒷면 출력하는 코드
				System.out.println("동전 던지기");
				if( randomTF ) System.out.println("앞면");
				else System.out.println("뒷면");
				
				
				//정수형 랜덤 수
				// * 4bytes : 32bits (*21억 xxx ~ 21억 xxx) 사이의 난수를 반환
				// 이코드는 32비트 정수 점위 내의 임의의 정수를 생성
				int fourByteRandom = random.nextInt();
				System.out.println("fourByteRandom : " + fourByteRandom);
				
				
				//random.nextInt(N)			: (0~N-1) 사이의 임의이 정수를 반환
				//random.nextInt(6)			: (0~5)
				//random.nextInt(6) + 1		: (0~6)
				//[공식]random.nextInt(개수) + 시작 숫자
				
				//주사위 던지기
				int dice = random.nextInt(6) + 1;			// (6)은 0~5값이 생성 되니 +1을 추가입력
				System.out.println("주사위 : " + dice);
				
				//로또
				int lotto = random.nextInt(45) + 1;				//이 코드는 1에서 45 사이의 임의의 정수를 생성하여 로또 번호를 시뮬레이션
				System.out.println("로또번호 : " + lotto);
				
				//실수형 랜덤수 
				double randomDouble = random.nextDouble();				//이 코드는 0.0(포함)에서 1.0(제외) 사이의 임의의 실수 값을 생성
				System.out.println("실수형 랜덤 수 : " + randomDouble);

			}

}
