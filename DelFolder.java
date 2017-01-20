package pack;
import java.io.File;
import java.util.Scanner;
public class DelFolder {
	public static void main(String[] args) {
		String path;
		Scanner sc;
		sc=new Scanner(System.in);
		path=sc.next();
		File filez = new File(path);
		deleteFolder(filez);
	}
	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
		folder.delete();
	}
}
