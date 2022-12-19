import java.util.Scanner;

public class EX_004 {
	public static void main(String[] args) {
		// 004. 숫자만 포함하는 문자열인지 검사
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		
		System.out.println(isNumeric(sb));
		
	}
	
	public static boolean isNumeric(StringBuffer s){
		try{
			Double.parseDouble(s.toString());
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}
