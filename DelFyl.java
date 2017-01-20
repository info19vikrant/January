package pack;
import java.io.*;
import java.util.Scanner;
public class DelFyl {
	Scanner sc;
	String path;
	public DelFyl()
	{ sc=new Scanner(System.in);
	}
	public void fun(){
		System.out.println("Enter the file name:");
		path=sc.next();
	try{
		
		File file = new File(path);

		if(file.delete()){
		System.out.println(file.getName() + " is deleted!");
		}else{
		System.out.println("Delete operation is failed.");
		}

		}catch(Exception e){ 
		e.printStackTrace(); 
		}
}
	public static void main(String args[])
	{
		DelFyl ob=new DelFyl();
		ob.fun();
	}
}