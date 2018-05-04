package wycthestudyofjava;

import java.util.Scanner;

public class 数组练习2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[3][3];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[0].length;j++)
			{
				a[i][j] = in.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[0].length;j++)
			{
				System.out.printf("%3d",a[i][j]);
				
			}
			System.out.println();
		}
   
	}

}
