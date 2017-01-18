package Anku;
import java.util.ArrayList;
public class ArrListCls2 {

	public void fun()
		{
			ArrayList <ArrListCls> al=new <ArrListCls> ArrayList();
			ArrListCls ob=new ArrListCls(1,56,"Vikrant");
			ArrListCls ob1=new ArrListCls(2,89,"Vandana");
			al.add(ob);
			al.add(ob1);
		}
		
		public static void main(String[] args) {
		ArrListCls2 ob=new ArrListCls2();
		ob.fun();
		}

	}
