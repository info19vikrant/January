package pack;

import java.io.File;

public class MoveFyl {
	public static void main(String[] args) {
		File from = new File("C:/Javaseleniumworld/Code.txt");
		File to = new File("C:/QTPworld/Code.txt");
		if (from.renameTo(to))
			System.out.println("Successfully Moved the file");
		else
			System.out.println("Error while moving the file");
	}
}
