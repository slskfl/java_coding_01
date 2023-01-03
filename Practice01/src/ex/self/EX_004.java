package ex.self;

import java.util.Scanner;

public class EX_004 {
	
	private static final String ONLY_DIGITS = "45566336754493420932877387482372374982374823" + "749823283974232237238472392309230923849023848234580383485342234287943943094"
			+ "234745374657346578465783467843653748654376837463847654382382938793287492326";

	private static final String NOT_ONLY_DIGITS = "45566336754493420932877387482372374982374823" + "749823283974232237238472392309230923849023848234580383485342234287943943094"
			+ "234745374657346578465783467843653748654376837463847654382382938793287492326A";

	public static void main(String[] args) {
		// 004. 숫자만 포함하는 문자열인지 검사
		Scanner scan = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer(scan.next());
		
		//System.out.println("ME : " + isNumeric(String.valueOf(sb)));
		
		System.out.println("ONLY_DIGITS : " + isNumeric(ONLY_DIGITS));
		System.out.println("NOT_ONLY_DIGITS : " + isNumeric(NOT_ONLY_DIGITS));
		
	}
	
	public static String isNumeric(String s){
		try{
			Double.parseDouble(s.toString());
			return "true";
		}catch(NumberFormatException e){
			return "false";
		}
	}
}
