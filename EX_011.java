import java.util.Scanner;

public class EX_011 {

	public static void main(String[] args) {
		// 011. 뮨자열 회문 검사
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		int mid = 0;
		boolean flag = true;
		if(sb.length() % 2 == 0){ //짝수
			mid = sb.length() / 2;
			for(int i=0; i<mid; i++){
				int j = sb.length()-1-i;
				if(sb.charAt(i) != sb.charAt(j)){
					flag = false;
					break;
				
				}
			}
		}else{ //홀수
			mid = sb.length() / 2;
			for(int i=0; i<mid; i++){
				int j = sb.length()-1-i;
				if(sb.charAt(i) != sb.charAt(j)){
					flag = false;
					break;
				
				}
			}
		}
		
		System.out.println(flag == false? "회문 아님" : "회문");

	}

}
