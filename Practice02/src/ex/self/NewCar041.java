package ex.self;

import java.awt.Color;
import java.awt.Point;
import java.util.Objects;

public class NewCar041 {

	private final String name;
	private final Color color;
	
	public NewCar041(String name, Color color) {
		super();
		this.name = Objects.requireNonNull(name, "name is null");
		this.color = Objects.requireNonNull(color, "color is null");
	}
	
	protected void assignDriver(String license, Point location) {
		Objects.requireNonNull(license, "License cannot be null");
		Objects.requireNonNull(location, "Location cannot be null");
	}

}
