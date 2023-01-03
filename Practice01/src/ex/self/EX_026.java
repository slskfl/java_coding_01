package ex.self;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EX_026 {

	public static void main(String[] args) {
		// 026. 두 큰 int/long 수의 합과 연간 오버플로 발생 시 산술 예외를 던져
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			long o1 = scan.nextLong();
			long o2 = scan.nextLong();
			
			int rlst1 = setIntAdd(n1, n2);
			long rlst2 = setLongAdd(o1, o2);
			
			System.out.println("int : " + rlst1);
			System.out.println("long : " + rlst2);
			
		} catch (ArithmeticException e) {
			System.out.println("오버플로우 발생");
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

	private static long setLongAdd(long o1, long o2) {
		// TODO Auto-generated method stub
		
		if(o1 > 0 && o2 > 0){
			if(o1 > Long.MAX_VALUE-o2){
				throw new ArithmeticException("Long o1 오버플로우 발생");
			}else if(o2 > Long.MAX_VALUE-o1){
				throw new ArithmeticException("Long o2 오버플로우 발생");
			}
		}
		return o1+o2;
	}

	private static int setIntAdd(int n1, int n2) {
		// TODO Auto-generated method stub
		
		if(n1 >0 && n2>0){
			if(n1>Integer.MAX_VALUE-n2){
				throw new ArithmeticException("int n1오버플로우 발생");
			}else if(n2>Integer.MAX_VALUE-n1){
				throw new ArithmeticException("int n2 오버플로우 발생");
			}
		}
		return n1+ n2;
	}

}
