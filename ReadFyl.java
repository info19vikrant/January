package pack;
import java.io.FileInputStream;
import java.util.*;
public class ReadFyl {
	String path,rno,name;
	Scanner sc;
	int ch;
	public ReadFyl()
	{
	 sc=new Scanner(System.in);
	}
	public void fun()
	{
		System.out.println("Enter the file name to read:");
		path=sc.next();
			try{
				FileInputStream fout=new FileInputStream(path);
				int i=0;
            while((i=fout.read())!=-1)
            {
            	System.out.print((char)i);
            }
			fout.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}}
	public static void main(String[] args) {
		ReadFyl ob=new ReadFyl();
		ob.fun();

	}

}
