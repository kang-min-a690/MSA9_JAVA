package Day06.EX01_PassingAgument;

import DAY04.Class.Pikachu;

public class EX02_CallByReference {

		//배열을 전달받아 배열 요소를 변경하는 매소드
	public static void setArr (int[] arr) {
		//i		:0,1,2,3,4
		//(i+1)	:1,2,3,4,5
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;    //10,20,30,40,50
		}
		System.out.println(":::::: setArr() 메소드 :::::::::");
		for (int i : arr) {
			System.out.println(i + " ");
	}
		System.out.println();

		}
	
	// 객체를 전달 받아 객체의 변수를 변경하는 메소드
		
	public static void setObject(Pikachu pikachu ) {
		pikachu.energy = 1000;
		pikachu.type = "불";
		System.out.println("::::::: setObject() 메소드 ::::::::::");
		System.out.println(pikachu);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 배열과 객체를 생성하여 메소드로 전달해보기
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();   //100,"전기"
		
		//배열에 값을 대입하기
		// arr[] : [1][2][3][4][5]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i +1);
		}
		
		System.out.println(" :::::::::: main() 메소드 ::::::::::");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		
		//** 레퍼런스에 의한 호출 Call By Reperence
		// 참조 자료형을 전달하는 방식
		// 참조자료형을 전달하면, 전달받은 메소드 매개변수에서
		//**해당 레퍼런스로 실제 겂을 접근할수 있어서, 값변경시 본래의 값더 변경된다.
		setArr( arr );
		setObject( pikachu);
		
		System.out.println(" ::::::::::: setXXX() 메소드 호출 후 ::::::::");
		for(int i : arr ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		
	}

}
