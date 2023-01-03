package ex.self;

import java.math.BigInteger;
import java.util.Scanner;

public class EX_033 {

	public static void main(String[] args) {
		// 033. BigInteger를 원시 타입으로 변환
		
		Scanner scan = new Scanner(System.in);
		BigInteger bint = new BigInteger(scan.next());
		
		System.out.println(bint.add(bint));

	}

}
