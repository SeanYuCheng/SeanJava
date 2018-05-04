package homework;

import java.util.Scanner;

public class WycLabTwoHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input the speed:");
		double speed = in.nextDouble();
		double g = 9.8;
		double u = 0.7;
		//定义参量
		double x1 = Math.pow(speed/3.6,2)/(2*g*u);
		double x2 = speed/3.6;
		//输入公式 x1 x2分别为反应距离和刹车距离
		System.out.printf("<speed in %.2f km/h>  <b.d.= %.2f m on wet road>  <b.d.= %.2f on dry road> ",
				speed , x2+1.5*x1 , x1+x2 );
		//输出
		
		

	}

}
