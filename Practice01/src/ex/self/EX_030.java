package ex.self;

import java.util.Scanner;

public class EX_030 {

	public static void main(String[] args) {
		// 030. 부호 없는 값의 나눗셈과 나머지
		
		try {
			Scanner scan = new Scanner(System.in);
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			System.out.println("나누기 몫 : " + n1/n2 + " ,나머지 : " + n1%n2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
