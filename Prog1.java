package Anku;

public class Prog1 {
	int i,j;
	public void fun()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	Prog1 ob=new Prog1();
	ob.fun();

	}

}
