package Codeup_10_20;

import java.util.Scanner;

public class code06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if (a > b) {
			for (int i = b; i < a; i++) {	
			
            System.out.print(b++ + " ");
			} 
        }
		if (a < b) {
			for (int c = a; c <= b; c++) {	
            System.out.print(a++ + " ");
			} 
        }
		else {
			System.out.print(a);
		}
		
		sc.close();
	}
}