package patterns;

public class Prog7 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i<=j)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
	}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(i>=j)
				{
				System.out.print(j);
			}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
