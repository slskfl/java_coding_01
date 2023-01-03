package ex.self;

import ex.book046.Player;

public class EX_046 {

	public static void main(String[] args) {
		// 046. equals()와 hashcode() : 자바의 메서드의 동작을 설명하고 예를 들어 보아라
		
		String str1 = "nina";
		String str2 = "nina";
		String str3 = "123";
		int num1 = 123;
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같다.");
		}else {
			System.out.println("str1과 str2은 다르다");
		}
		
		if(str2.equals(str3)) {
			System.out.println("str2과 str3은 같다.");
		}else {
			System.out.println("str2과 str3은 다르다");
		}
		
		if(str3.equals(num1)) {
			System.out.println("str3과 num1은 같다");
		}else {
			System.out.println("str3과 num1은 다르다");
		}
		
		if(String.valueOf(num1).equals(str3)) {
			System.out.println("num1과 str3은 같다");
		}else {
			System.out.println("num1과 str3은 다르다");
		}
		
		
		String046 str4 = new String046("nina");
		String046 str5 = new String046("nina");
		String046 str6 = str5;
		
		System.out.println(str1.hashCode()); // 3381422
		System.out.println(str2.hashCode()); // 3381422
		System.out.println(str3.hashCode()); // 48690
		System.out.println(str4.hashCode()); // 1651191114
		System.out.println(str5.getStr()); 		// 3381422
		System.out.println(str5.hashCode()); // 1586600255
		System.out.println(str6.hashCode()); // 1586600255
		
		Player p1 = new Player(1, "refael");
		Player p2 = new Player(1, "refael");
		
		System.out.println("----------------------------------------------------");
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());


	}

}
