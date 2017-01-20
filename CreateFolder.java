package pack;

import java.io.File;
import java.util.Scanner;

public class CreateFolder {

	public static void main(String[] args) {
		String path;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the location:");
		path = sc.next();
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
	}
}
