package pack;
import java.io.FileOutputStream;
import java.util.*;
public class WriteFyl {
	String data,path;
	Scanner sc;
	
	public WriteFyl()
	{
	 sc=new Scanner(System.in);
	}
	public void fun()
	{
		System.out.println("Enter the file name:");
		path=sc.next();
			try{
				FileOutputStream fout=new FileOutputStream(path);
		System.out.println("Enter data");
		data=sc.next();
		byte b[]=data.getBytes();
		fout.write(b);
		fout.close();
			}
			 catch(Exception e)
			{
				System.out.println(e);
			}}
		public static void main(String[] args) {
			WriteFyl ob=new WriteFyl();
			ob.fun();
	}

}
