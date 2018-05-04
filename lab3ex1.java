package wycthestudyofjava;

import java.util.Scanner;

public class lab3ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("请输入您的成绩：");
		Scanner in = new Scanner(System.in);
		int a ;
		a = in.nextInt();
		System.out.print("您输入的成绩为"+a+"\n您的GPA为：");
		if (a>=90 )
		System.out.print("4");
		else if (a<90 && a>=80)
		System.out.print("3");
		else if (a<80 && a>=70)
		System.out.print("2");
		else if (a<70 && a>=60)
		System.out.print("1");
		else if (a>0 && a<60)
		System.out.print("0");
		
		
		
		

	}

}
