package ex.self;

public class EX_053 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Point053 point1 = new Point053(5.12, 3.14);
		
		Point053 clone1 = point1.clonePoint(); //수동 복제
		Point053 clone2 = point1.clone(); //clone 함수 사용
		Point053 clone3 = new Point053(point1); //생성자로 복제
		
		Radius053 radius = new Radius053();
		radius.setStart(1);
		radius.setEnd(2);
		Point053 point2 = new Point053(1.11, 3.33, radius);
		
	}

}
