package ex.book016;

import java.util.regex.Pattern;

public final class Strings {

	private Strings() {
		throw new AssertionError("Cannot be instantiated");
	}

	public static boolean containsV1(String text, String subtext) {

		if (text == null || subtext == null || text.isBlank() || subtext.isBlank()) {
			// or throw IllegalArgumentException            
			return false;
		}

		return text.matches("(?i).*" + Pattern.quote(subtext) + ".*");
	}

	public static boolean containsV2(String text, String subtext) {

		if (text == null || subtext == null || text.isBlank() || subtext.isBlank()) {
			// or throw IllegalArgumentException            
			return false;
		}

		return text.indexOf(subtext) != -1; // or lastIndexOf()
	}
}
