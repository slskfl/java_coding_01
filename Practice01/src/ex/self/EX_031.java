package ex.self;

import java.math.BigDecimal;

public class EX_031 {

	public static void main(String[] args) {
		// 031. double/float가 유한 부동소수점 값인지 검사
		// 소수 연산을 할 경우 프로그램상에서 정확한 실수 표현이 불가능하다.
		// 따라서 BigDecimal 라이브러리를 통해 연산한다.
		
		double d = 0.0d;
		for(int i=0; i<100; i++){
			d += 0.1d;
		}
		System.out.println("Double result : " + d*100 + " , value :" + d); //Double result : 999.9999999999981 , value :9.99999999999998
		
		float f = 0.0f;
		for(int i=0; i<1000; i++){
			f += 0.1f;
		}
		
		System.out.println("Float result : " + f*100 + " , value :" + f); //Float result : 9999.904 , value :99.99905
	
		//BigDecimal에 0.1인 숫자를 넣으면 0.1을 근사한 값으로 넣는다.
		//따라서 BigDecimal에서 소우 연산을 할 때에는 Striing으로 변환해서 넣어야한다.
		
		
		BigDecimal bigD = new BigDecimal(0.1);
		BigDecimal bigS = new BigDecimal("0.1");
		
		System.out.println("bigD : " + bigD); //bigD : 0.1000000000000000055511151231257827021181583404541015625
		System.out.println("bigS : " + bigS); //bigS : 0.1
	}

	
}
