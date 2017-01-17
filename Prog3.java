package Anku;

public class Prog3 {

	int i,j;
	public void fun()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
					System.out.print(1);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Prog3 ob=new Prog3();
		ob.fun();
		

	}

}
