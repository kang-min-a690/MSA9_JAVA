package DAY10_13.EX02_Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysEx_배열복사찾기 {

	public static void main(String[] args) {
		Integer[] arr = { 5, 3, 4, 1, 2 };

		// 배열을 오름차순
		Arrays.sort(arr);
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 배열 정렬 sort -내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 이진 탐색 알고리즘 (binarySearch)
		// array.binarySearsh(배열, 찾을 값)
		// 전제 조건 : 주어진 배열이 오름차순 정렬디어있어야 한다.
		// 이진탐색 알고리즘을 사용하여 탐색하우,
		// 1. 해당 값이 있으면 , 그위치index 를반환
		// 2. 해당값이 없으면, () - (insertion point -1) 음수로 변환
		// *insertion point
		// 해당 값이 배열이 잇다고 가정햇을때 , 정렬에 따라 삽입되어야 할 위치

		// 1~100 사이의 랜덤 정수 수열을 만들고
		// 이중 에서 정수 10을 이진 탐색 알고리즘을 탐색해보자

		int[] random = new int[100];		//랜덤배열 [100] 생성
		Random rand = new Random();
		for (int i = 0; i < random.length; i++) {
			random[i] = rand.nextInt(100) + 1;		//랜덤배열 1 부터 100까지의 랜덤 수로 채움
		}

		// 오름차순 정렬
		Arrays.sort(random);
		for (int item : random) {
			System.out.print(item + " ");
		}

		System.out.println();

		// 이진 탐색
		// random배열 에서 10이라는 값을 랜덤수중에서 탐색
		// 값이 있으면 해당 값의 인덱스를 반환하고, 없으면 삽입 포인트(insertion point)의 음수를 반환
		int result = Arrays.binarySearch(random, 10);
		if (result < 0) {
			System.out.println("랜덤 수 10이 없음");
			System.out.println("insertion point : " + result);
		} else {
			System.out.println("랜덤 수 10의 위치 (index) : " + result);
		}
		
		//arrays.fill(값)
		//값으로 모든 배열요소를 채우는 매소드
		int fill[] = new int[10];					
													//특정값 채우기
		Arrays.fill(fill, 8);						// **이제부터 배열의 모든요소를 8로 출력
		
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + " ");
		}
		System.out.println();
		
		
		//Arrays.copyOf (배열 ,길이)
		// 배열을 앞에서부터 (길이)개의 요소를 복사하여 새 배열로 반환
		//배열의 일부를 복사하기
		int copy[] = Arrays.copyOf(fill, 3);		//fill 배열의 앞에서부터 3개의 요소를 복사하여 copy 배열을 만듬
		// 8 8 8 8 8    8 8 8 8 8 					//Arrays.copyOf() 메서드는 배열의 지정된 길이만큼 복사
		//8 8 8 을 복사하여 반환
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		
		// Arrays.copyOfRange (배열, 시작index, 끝 index+1)
		// 배열을 시작index~ 끝index 까지의 요소를 복하여 새배열로 반환
		//특정범위 복사하기
		int copyRange[] = Arrays.copyOfRange(random, 11, 21);			//index 11~20까지 복사
		
		for (int i = 0; i < copyRange.length; i++) {					//Arrays.copyOfRange() 메서드는 시작에서 끝까지의 요소를 복사
			System.out.print(copyRange[i] + " ");
		}
		System.out.println();
	}

}
