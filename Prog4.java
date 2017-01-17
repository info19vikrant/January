package Anku;

public class Prog4 {
	int i,j,k,l;
	public void fun()
	{
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Prog4 ob=new Prog4();
		ob.fun();
	}

}
