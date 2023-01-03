package ex.self;

import java.util.Scanner;

public class EX_007 {

	public static void main(String[] args) {
		// 007. 문자열을 int, long, float, double로 변환

		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		
		isNumeric(sb);
	}
	
	public static void isNumeric(StringBuffer s){
		try{
			double n = Double.parseDouble(s.toString());
			
			System.out.println("int : " + (int)n); //int
			System.out.println("long : " + (long)n); //long
			System.out.println("float : " + (float)n); //float
			System.out.println("double : " + n); //Double
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
