package ex.self;

import java.util.Scanner;

public class EX_037 {

	public static void main(String[] args) {
		// 037. 두 큰 int/long 수의 곱과 연산 오버플로우
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(setMulInt(num1, num2));
		
		long o1 = scan.nextLong();
		long o2 = scan.nextLong();
		System.out.println(setMulLong(o1, o2));
	}

	private static long setMulLong(long o1, long o2) {
		// TODO Auto-generated method stub
		
		if(o1>0 && o2>0){
			if(o1>Long.MAX_VALUE/o2){
				throw new ArithmeticException("Long o1 오버플로우 발생");
			}else if(o2>Long.MAX_VALUE/o1){
				throw new ArithmeticException("Long o2 오버플로우 발생");
			}
		}
		return o1*o2;
	}

	private static int setMulInt(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if(num1>0 && num2>0){
			if(num1>Integer.MAX_VALUE/num2){
				throw new ArithmeticException("Int num1 오버플로우 발생");
			}else if(num2>Integer.MAX_VALUE/num1){
				throw new ArithmeticException("Int num2 오버플로우 발생");
			}
		}
		return num1*num2;
	}

}
