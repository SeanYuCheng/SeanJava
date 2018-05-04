package 类和方法;

import java.util.Scanner;

public class Triangle {
	public static double area(double a,double b,double c)
	{
		double area;
		double half;
		half = 0.5*(a+b+c);
		area = Math.pow(half*(half-a)*(half-b)*(half-c), 0.5);
		return area;
		
	}
    public static void displayTriangle(int hight,int a)
    {
       String blank="   ";
       for(int i=1;i<=hight;i++)
       {
    	   for(int k=i;k<hight;k++) {
    		   System.out.print(blank);
    	   }
    	   for(int j=1;j<=2*i-1;j++) {
    		   System.out.printf("%3d",a);
    		   
    	   }
    	   System.out.println();
       }}
    public static void displayTriangle(int hight,char a)

       {
          String blank="   ";
          for(int i=1;i<=hight;i++)
          {
       	   for(int k=i;k<hight;k++) {
       		   System.out.print(blank);
       	   }
       	   for(int j=1;j<=2*i-1;j++) {
       		   System.out.printf("%3c",a);
       		   
       	   }
       	   System.out.println();
          }
       
       
    }
}

