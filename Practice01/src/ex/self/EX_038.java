package ex.self;

import java.math.BigDecimal;
import java.util.Scanner;

public class EX_038 {

	public static void main(String[] args) {
		// 단일 곱센 나누기 : 세 float/double 값 a,b,c를 받아 a*b+c를 효율적으로 계산
		
		try {
			Scanner scan = new Scanner(System.in);
			float af = scan.nextFloat();
			float bf = scan.nextFloat();
			float cf = scan.nextFloat();
			
			double ad = scan.nextDouble();
			double bd = scan.nextDouble();
			double cd = scan.nextDouble();
			
			BigDecimal afBig = new BigDecimal(String.valueOf(af));
			BigDecimal bfBig = new BigDecimal(String.valueOf(bf));
			BigDecimal cfBig = new BigDecimal(String.valueOf(cf));
			BigDecimal adBig = new BigDecimal(String.valueOf(ad));
			BigDecimal bdBig = new BigDecimal(String.valueOf(bd));
			BigDecimal cdBig = new BigDecimal(String.valueOf(cd));
			
			System.out.println(cfBig.add(afBig.multiply(bfBig)));
			System.out.println(cdBig.add(adBig.multiply(bdBig)));
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}

	}

}
