import java.util.Arrays;
import java.util.Scanner;

import 类和方法.Triangle;
import 类和方法.subarrays;

public class myTriangle {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		/*int a,b;
		char c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.next().charAt(0);
		Triangle.displayTriangle(a,b);
		Triangle.displayTriangle(a,c);*/
	    int []arr=new int [] {1,2,3,4,5,6,7,8};
	    int[]newarr=subarrays.cut(2, 5, arr);
	    System.out.println(Arrays.toString(newarr));

		
	    

	}
	

}
