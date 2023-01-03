package ex.self;

import java.util.Scanner;

public class EX_029 {

	public static void main(String[] args) {
		// 029. 부호 없는 두 수 비교
		
		Scanner scan = new Scanner(System.in);
		int num1 = Math.abs(scan.nextInt());
		int num2 = Math.abs(scan.nextInt());
		
		
		if(num1==num2){
			System.out.println("같음");
		}else if(num1>num2){
			System.out.println("num1이 더 큼");
		}else{
			System.out.println("num2이 더 큼");
		}
	}

}
