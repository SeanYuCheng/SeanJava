package wycthestudyofjava;

import java.util.Scanner;

public class bakhshali2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		double S;
		int x0;
		double xn;
		double xm;
		double an;
		double bn;
		int count=0;
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
				{x0=(int)((mid1-mid2)/2);
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
			x0 = mid2int;
		
		//利用二分法确定x0的值,上面这个mid1int mid2int 是为了排除区间中刚好存在一个整数的情况，这样的话输入36这样的值也可以正常输出
		try {
			//异常捕获
			if((S<1 && S>0) || S<0 )
		{
			Exception e2=new Exception();
			throw e2;
			//这个情况下抛出异常
			
		}
			
		    else if(S==0)
				System.out.println("x0 = "+0+"\nx1 = "+0);
			else 
			{   xn=x0;
			    System.out.println("x0 = "+x0);
				do
				{
			    count++;
				xm=xn;
				an=(S-xn*xn)/(2*xn);
				bn=xn+an;
				xn=bn-an*an/(2*bn);
				System.out.printf("x%d = %.6f\n", count,xn);
				}while(Math.abs(xm-xn)>Math.pow(0.1, 6));
				//函数部分
			    System.out.printf("Library:%.6f\n",Math.sqrt(S));
			}
			}catch(Exception e2) {
				System.out.println("error");
			}

	}

}
