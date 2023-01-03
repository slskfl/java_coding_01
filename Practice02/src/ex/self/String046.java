package ex.self;

public class String046 {

	private final String str;
	
	public String046(String str) {
		this.str = str;
	}

	public String getStr() {
		return String.valueOf(str.hashCode());
	}
	
	
}
