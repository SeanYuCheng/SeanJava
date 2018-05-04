package wycthestudyofjava;

import java.util.Scanner;

public class 二维数组冒泡排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int[4][5];
		Scanner in = new Scanner(System.in);
		int element;
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
				
				element = in.nextInt();
				arr[i][j]=element;
				
			}}
		int[][]newarr=new int[4][5];
		for(int i=0;i<newarr.length;i++) {
		newarr[i]=arr[i].clone();
		}
		
		
		for(int i=0;i<20;i++) {
		for(int j=0;j<19;j++) {
			int mid;
			if(newarr[j/5][j%5]>newarr[(j+1)/5][(j+1)%5]) {
			mid = newarr[j/5][j%5];
			newarr[j/5][j%5] = newarr[(j+1)/5][(j+1)%5];
			newarr[(j+1)/5][(j+1)%5] = mid;
			}}}
			for(int k=0;k<newarr.length;k++) {
			for(int p = 0;p<newarr[k].length;p++) {
			System.out.print(newarr[k][p]+"\t");
}
			System.out.println();
}
			int max = newarr[3][4];
			int min = newarr[0][0];
		    for(int i=0;i<arr.length;i++) {
		    	for(int j=0;j<arr[i].length;j++) {
		    		if(max==arr[i][j]) {
		    			System.out.println("最大值所在为"+i+"行"+j+"列");}
		    		
		    	}
		    }
		    for(int i=0;i<arr.length;i++) {
		    	for(int j=0;j<arr[i].length;j++) {
		    		if(min==arr[i][j]) {
		    			System.out.println("最小值所在为"+i+"行"+j+"列");}
		    		
		    	}
		    }
		}
	}

    
	
