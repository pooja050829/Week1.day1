package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int f=0;
		if(n==0 || n==1)
		{
			System.out.println(n + " is not a prime Number");
		}
		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
						System.out.println(n + " is not a prime Number");
				f=1;
				break;
				}
			}
		}
		if(f==0)
			System.out.println(n +" is prime Number");

	}

	
}
