import java.util.Scanner;

public class EX_012 {

	public static void main(String[] args) {
		// 012. 중복 문자 제거
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<sb.length(); i++){
			if(sb.indexOf(String.valueOf(sb.charAt(i))) == i){
				result.append(String.valueOf(sb.charAt(i)));
			}
		}
		
		System.out.println(result);
	}
}
