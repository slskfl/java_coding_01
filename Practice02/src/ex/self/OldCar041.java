package ex.self;

import java.awt.Color;
import java.awt.Point;

public class OldCar041 {
	
	private final String name;
	private final Color color;
	
	public OldCar041(String name, Color color) {
		
		if(name == null) throw new NullPointerException("name이 null");
		if(color == null) throw new NullPointerException("color이 null");
		
		this.name = name;
		this.color = color;
	}
	
	protected void assignDriver(String license, Point location ) {
		if(license == null)  throw new NullPointerException("license이 null");
		if(location == null)  throw new NullPointerException("location이 null");
	}
	

}
