package ex.self;


import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.tools.javac.Main;

import ex.book054.User;

public class EX_054 {
	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User054 user1 = new User054("nina", "12345asd", "han", "leena", "nina@gmail.com");
		System.out.println(user1.toString());
		logger.log(Level.INFO, "This user rocks : {0}", user1);
	}

}
