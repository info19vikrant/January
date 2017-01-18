package Anku;
import java.util.ArrayList;
public class ArrList {

	public void fun()
	{
		ArrayList <String> al=new <String> ArrayList();
		al.add("vikrant");
		al.add("ankit");
		al.add("mayank");
		for(String st:al)
		{
			System.out.println("all Items are:"+st);
		}
		al.remove(2);
		for(String st1:al)
		{
			System.out.println("Items after removal are:"+st1);
		}
		   
	    		}
	
	public static void main(String[] args) {
	ArrList ob=new ArrList();
	ob.fun();
	}

}
