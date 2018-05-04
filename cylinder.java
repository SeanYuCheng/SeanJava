package 类和方法;

import java.util.Scanner;

class cylinder {
private double radius;
private double hight;
private double volume;
public void setcylinder(double r,double h)
	{
	    r=0;
	    h=0;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入半径：");
		r=in.nextDouble();
		System.out.print("请输入高：");
		h=in.nextDouble();
		if(r>0 && h>0)
		{
			radius = r;
			hight = h;
		}
		else
			System.out.print("error");
	}
public void volume()
{   
	volume = (Math.PI*Math.pow(radius, 2)*hight);
	}
public double getvolume()
{
	return volume;
	}
	



}
