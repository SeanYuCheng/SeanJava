package wycthestudyofjava;

import java.util.Scanner;

public class 矩阵最大值最小值输出 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int[4][5];
		Scanner in = new Scanner(System.in);
		int element;
		element = in.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[3].length;j++)
			{
				arr[i][j]=element;
				element = in.nextInt();
				
			}
		}
		int[][]newarr = new int [4][5];
		int mid;
		for(int i=0;i<arr.length;i++) {
		System.arraycopy(newarr[i], 0, arr[i], 0, arr[i].length);
		}
		for(int i = 0;i<newarr.length-1;i++)
		{
			for(int j = 0;j<newarr[1].length-1;j++)
			{
				if(newarr[i][j]<newarr[i][j+1])
				{
					mid=newarr[i][j];
					newarr[i][j]=newarr[i][j+1];
					newarr[i][j+1]=mid;
				}
				
				
			}
		for(int i1 = 0;i1<newarr.length-1;i1++)
			{
			for(int j = 0;j<newarr[1].length-1;j++)
			{
				if(newarr[i1][j]<newarr[i1+1][j])
				{
					mid=newarr[i1][j];
					newarr[i1][j]=newarr[i1+1][j];
					newarr[i1+1][j]=mid;
				}
				for(int k=0;k<arr.length;k++) {
					for(int p = 0;p<arr[1].length;p++) {
				System.out.print(arr[k][p]+"  ");
			}
				System.out.println();
				}}
			
		}
		
		}
	}

}
