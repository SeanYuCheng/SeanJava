import java.util.Scanner;

public class QuadraticEquation {
	private double a,b,c;
	Scanner in=new Scanner(System.in);
	public void setParameter()
	{
		System.out.println("please in put a,b,c:");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
		
	}
	public void findRoot()
	{
		double root1;
		double root2;
		if(Math.pow(b, 2)-4*a*c>0)
		{
			System.out.println("2 roots");
			root1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			root2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			System.out.printf("first root is:%f\nsecond root is:%f",root1,root2);
		}
		else if((Math.pow(b, 2)-4*a*c==0))
			{
			    root1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			    System.out.println("1 root");
			    System.out.printf("root is:%f",root1 );
			}
		else
			System.out.println("no root");
				
	}

}
