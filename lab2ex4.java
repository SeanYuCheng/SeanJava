package wycthestudyofjava;

import java.util.Scanner;

public class lab2ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x1;
		double x2;
		double y1 ;
		double y2;
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		System.out.println(Math.sqrt((Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2))));
		

	}

}
