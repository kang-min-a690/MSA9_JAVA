package Codeup_21_40;


import java.util.Scanner;

public class Code1025_지페분리기초  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력문
        String input = sc.nextLine();  // 입력을 문자열로 받음
        
        // 입력된 문자열을 문자 배열로 변환
        char[] arr = input.toCharArray();
        
        // 자리수 계산을 위한 배열
        int[] name = new int[5];
        
        // 각 자리의 값 계산
        // 문자를 정수로 변환 '0'
        // 자릿수에 맞게 0000씩 곱함
        // 정수 변환이 먼저 되야하니까 괄호 사용
        name[0] = (arr[0] - '0') * 10000;
        name[1] = (arr[1] - '0') * 1000;
        name[2] = (arr[2] - '0') * 100;
        name[3] = (arr[3] - '0') * 10;
        name[4] = arr[4] - '0';		//한자리수라 계산필요없음
        
        // 출력문
        // int value 는 출력할때 사용할 새로운 문장, 겹치면 오류나서 따로씀
        // name의 값을 [%d] 안에 넣어 출력
        for (int value : name) {
            System.out.printf("[%d]\n", value);
        }
        
        sc.close();
    }
}
