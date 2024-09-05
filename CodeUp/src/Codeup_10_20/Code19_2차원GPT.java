package Codeup_10_20;

import java.util.Scanner;

public class Code19_2차원GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2차원 배열 선언
        int[][] arr = new int[n][n];
        
        // 각 행의 첫 번째 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
        }
        
        // 배열 채우기
        for (int i = 0; i < n; i++) {
            int num = arr[i][0]; // 현재 행의 첫 번째 숫자
            for (int j = 1; j <= i; j++) {
                num--; // 숫자를 감소시키며 채우기
                arr[i][j] = num;
            }
        }
        
        // 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 줄 바꿈
        }

        sc.close();
    }
}

