package wycthestudyofjava;

import java.util.Arrays;
import java.util.Scanner;

public class array {
private int [] arr=new int[0];
	public void add (int s) {
		Scanner in =new Scanner(System.in);
		int[]newarr = new int[0];
		s=in.nextInt();
		while(s>0) {
		arr = new int [newarr.length+1];
	    System.arraycopy(newarr, 0, arr, 0, newarr.length);
	    arr[newarr.length] = s;
	    newarr=arr;
	    s=in.nextInt();

		}
	}
	public int[] getArr(){
		return arr;
	}
		

	

}
