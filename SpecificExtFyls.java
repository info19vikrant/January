package pack;
import java.io.File;
import java.util.*;
public class SpecificExtFyls {
	String path,ext;
	Scanner sc;
	public SpecificExtFyls()
	{
		sc=new Scanner(System.in);
	}
	public void fun()
	{
	System.out.println("Enter the folder name:");
	path=sc.next();
	System.out.println("Enter the extension");
	ext=sc.next();
	File file = new File(path);
	File[] files = file.listFiles();
	for(File f: files){
	if(f.getName().toLowerCase().endsWith(ext)){
	System.out.println(f.getName());
	}
	}
	}
	public static void main(String args[])
	{
		SpecificExtFyls ob=new SpecificExtFyls();
		ob.fun();
	}
}


