import java.util.Scanner;

public class EX_013 {

	public static void main(String[] args) {
		// 013. 주어진 문자 제거
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer(scan.nextLine());
		StringBuffer sb2 = new StringBuffer(scan.nextLine());
		
		while(sb1.indexOf(String.valueOf(sb2)) >= 0){
			int str = sb1.indexOf(String.valueOf(sb2));
			int fsh = str + sb2.length();
			
			sb1.replace(str, fsh, "");
		}
		System.out.println(sb1);
	}

}
