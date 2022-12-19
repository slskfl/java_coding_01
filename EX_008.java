import java.util.Scanner;

public class EX_008 {

	public static void main(String[] args) {
		// 008.문자열에서 여백 제거
		
		Scanner scan = new Scanner(System.in);
		String sb = scan.nextLine();
		
		//앞, 뒤의 공백은 trim으로 제거가 가능하나, 중간에 있는 공백은 repalce를 통해서 공백을 제거해야 한다.
		System.out.println(sb.replace(" ", ""));
	}

}
