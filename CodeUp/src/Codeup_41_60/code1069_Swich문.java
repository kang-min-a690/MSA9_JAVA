package Codeup_41_60;

import java.util.Scanner;

public class code1069_Swich문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		
		
		switch (input) {
		case "A":	
			System.out.println("best!!!");
			break;
		case "B":	
			System.out.println("good!!");
			break;	
		case "C":	
			System.out.println("run!");
			break;
		case "D":	
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
		sc.close();
	}

}
