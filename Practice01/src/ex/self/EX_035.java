package ex.self;

import java.util.Scanner;

public class EX_035 {

	public static void main(String[] args) {
		// 035. 나눗셈과 나머지의 버림 계산
		
		try {
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			int y = scan.nextInt();
		
			System.out.println("나머지 버림 : " + x/y);
			System.out.println("나눈셈 버림 : " + x%y);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

}
