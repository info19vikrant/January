package Anku;

public class Prog2 {
	int i,j;
	public void fun()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Prog2 ob=new Prog2();
		ob.fun();
	}

}
