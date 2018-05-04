package homework;

import java.util.Scanner;

public class bakhshali {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		double S;
		int x0;
		double x1;
		double an;
		double bn;
		//参量的命名
		System.out.print("Input:");
		S=in.nextDouble();
		
		double mid1=S;
		double mid2=0;
		do {
			if(((mid1+mid2)/2)*((mid1+mid2)/2)<S)
			{
				mid2 = mid2+(mid1-mid2)/2;
			}
			else if(((mid1+mid2)/2)*((mid1+mid2)/2)>S)
			{
				mid1 = mid1-(mid1-mid2)/2;
			}
			else
			{
				x0=(int)((mid1-mid2)/2);
				break;
			}
				
			
		}while(Math.abs(mid1-mid2)>=1);
		int mid1int = (int)mid1;
		int mid2int = (int)mid2;
		if(mid2int<mid1int)
		{
			if(mid1int*mid1int<=S)
			{
				x0 = mid1int;
			}
			else
				x0 = mid2int;
		}
		else
			x0=mid2int;
		//利用二分法确定x0的值,上面这个mid1int mid2int 是为了排除区间中刚好存在一个整数的情况，这样的话输入36之类的值都能正确输出
		try {
			//异常获取
		if(S<1 && S>0 || S<0 )
		{
			Exception e1=new Exception();
			throw e1;
			//抛出异常
			
		}
		else if(S==0)
			System.out.println("x0 = "+0+"\nx1 = "+0);
		else 
		{
			an=(S-x0*x0)/(2*x0);
			bn=x0+an;
			x1=bn-an*an/(2*bn);
			System.out.printf("x0 = %d\nx1 = %.6f",x0,x1);
		}
		//函数部分
		}catch(Exception e1) {
			System.out.println("error");
		}

	}

}
