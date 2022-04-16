package week1.day1;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r=8;
int firstNum=0;
int scndNum=1;
int sum=0;

System.out.println(firstNum);
for(int i=scndNum;i<=r;i++)
{
	sum=firstNum+scndNum;
	firstNum=scndNum;
	scndNum=sum;
	System.out.println(sum);
}

	}

}
