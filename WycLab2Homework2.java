package homework;

import java.util.Scanner;

public class WycLab2Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double g = 9.8;
		double u1 = 0.4;
		double u2 = 0.7;
		//u1是潮湿的，u2是干燥的
		//参数定义
		System.out.println("Input the Start Speed:");
		double StartSpeed = in.nextDouble();
		System.out.println("Input the Top Speed:");
		double TopSpeed = in.nextDouble();
		//输入
		for(double Speed = Math.floor(StartSpeed/5)*5; Speed <= Math.ceil(TopSpeed/5)*5 ; Speed = Speed+5)
			//对输入的速度上下限除五后分别向下向上取整之后乘5
		{
			double x1 = Math.pow(Speed/3.6,2)/(2*g*u1);
            double x2 = Math.pow(Speed/3.6, 2)/(2*g*u2);
			double x3 = Speed/3.6;
			//公式输入 x1潮湿 x2干燥
			System.out.printf("<speed in %.2f km/h>  <b.d.= %.2f m on wet road>  <b.d.= %.2f m on dry road> \n",
					Speed , x1+x3 , x2+x3 );
			//输出 
		}
		
		

	}

}
