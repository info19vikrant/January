package pack;
import java.io.File;
import java.util.*;
public class AllFyls {
	String path;
	Scanner sc;
	public AllFyls()
	{
		sc=new Scanner(System.in);
	}
	public void fun(){
		System.out.println("Enter the folder name:");
		path=sc.next();
		File file = new File(path);
		File[] files = file.listFiles();
     	for(File f: files){
	    System.out.println(f.getName());
     	}}
		public static void main(String a[]){
		AllFyls ob=new AllFyls();
		ob.fun();
	
	}
	}

