package ex.self;

import java.util.List;

public class EX_044 {

	public static void main(String[] args) {
		// 044. 인덱스가 0부터 길이까지 범위에 속하는지 검사 : 주어진 인텍스가 0(포함)에서 주어진 길이(불포함) 사이인지 검사하는 프로그램
		
		int[] arrNum = new int[5];
		try {
			for(int i=0; i<arrNum.length; i++) {
				if(arrNum[i+1] == 0) {
					arrNum[i] += 1;
					System.out.println(arrNum[i]);
				}
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("배열 범위 초과");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
