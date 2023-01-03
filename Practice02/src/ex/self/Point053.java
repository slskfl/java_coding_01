package ex.self;

import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Point053 implements Cloneable{

	private double x;
	private double y;
	private Radius053 radius;
	
	public Point053() {}
	
	public Point053(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point053(double x, double y, Radius053 radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = this.radius;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public Radius053 getRadius() {
		return radius;
	}

	public void setRadius(Radius053 radius) {
		this.radius = radius;
	}

	//수동 복제
	public Point053 clonePoint() {
		Point053 point053 = new Point053();
		point053.setX(this.x);
		point053.setY(this.y);
		return point053;
	}
	
	//Object clone()을 사용한 복제
	@Override
	public Point053 clone() throws CloneNotSupportedException{
		return (Point053) super.clone();
	}
	
	//생성자를 통한 복제
	public Point053(Point053 another) {
		this.x = another.x;
		this.y = another.y;
	}
	
	//직렬화를 통한 복제
	private static <T> T cloneThroughSerializable(T t) {
		
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos); // 직렬화
			oos.writeObject(t);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais); //역직렬화
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
		
	}
	
}

