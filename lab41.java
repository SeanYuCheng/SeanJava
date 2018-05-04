package wycthestudyofjava;

import java.util.Arrays;
import java.util.Scanner;

public class lab41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double[]myList=new double[8];
		for(int i=0;i<myList.length;i++) {
			myList[i]=in.nextDouble();
		}
		System.out.println(Arrays.toString(myList));
		for(int i=0;i<myList.length-1;i++) {
			double mid=myList[i];
			myList[i]=myList[i+1];
			myList[i+1]=mid;
			
		}
		System.out.println(Arrays.toString(myList));
		

	}

}
