package ex.self;

import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;

import ex.book041.NewCar;
import ex.book041.OldCar;

public class EX_041 {

	public static void main(String[] args) {
		//041. null 참조 검사와 맞춤형 NullPointException 던지기 : 주어진 참조에 null 검사를 수행하고 맞춤형 메세지로 예외를 던지는 프로그램
		NewCar041 newCar = new NewCar041("Mazda", new Color(123, 123, 223));
		OldCar041 oldCar = new OldCar041("car", new Color(123, 123, 223));

		newCar.assignDriver(null, new Point(1, 1));
		oldCar.assignDriver("Transport", null);
	}
}
