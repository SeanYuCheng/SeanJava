package wycthestudyofjava;

public class BigSquare{
public static void main(String[] args){
	String st="   ";
	int a=0;
	for(int i=1;i<=12;i++)
	{
		for(int k=1;k<=12-i;k++)
		{
			System.out.print(st);
		}
		for(int j=1;j<=2*i-1;j++)
		{
			
			System.out.printf("%3d", Math.abs(j-i));

			
		}
		System.out.println();
	}
	for(int i=11;i>=1;i--)
	{
		for(int k=1;k<=12-i;k++)
		{
			System.out.print(st);
		}
		for(int j=1;j<=2*i-1;j++) 
		{
			System.out.printf("%3d",Math.abs(i-j));
		}
		System.out.println();
	}
	

}
}
