import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times;
		int number1;
		int number2;
		times=in.nextInt();
		int []time=new int[times];
		for(int i=0;i<times;i++)
		{
			time[i]=in.nextInt();
		}
		for(int i=0;i<times;i++)
		{
			int mid=0;
			number1=1;
			number2=2;
			while(time[i]>=number1)
			{
				System.out.println(number1);
				mid=number2;
				number2=number1+number2;
				number1=mid;

				
			}
			
			
		}
	

		}
		
	}


