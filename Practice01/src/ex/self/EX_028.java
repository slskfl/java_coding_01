package ex.self;
import java.util.Scanner;

public class EX_028 {

	public static void main(String[] args) {
		// 028. 부호 없는 수로 변환
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(Long.valueOf(Math.abs(num)));
	}

}
