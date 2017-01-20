package pack;
import java.io.FileOutputStream;
import java.util.*;
public class OpenFyl {
	String path,rno,name;
	Scanner sc;
	int ch;
	public OpenFyl()
	{
	 sc=new Scanner(System.in);
	}
	public void fun()
	{
		System.out.println("Enter the file name:");
		path=sc.next();
			try{
				FileOutputStream fout=new FileOutputStream(path);
			
			fout.close();
	} catch(Exception e)
	{
		System.out.println(e);
	}}
				public static void main(String[] args) {
					OpenFyl ob=new OpenFyl();
					ob.fun();
				}
}
