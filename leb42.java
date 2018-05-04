package wycthestudyofjava;

import java.util.Arrays;
import java.util.Scanner;

public class leb42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double[]myList=new double[10];
		double sum=0;
		for(int i=0;i<myList.length;i++) {
			myList[i]=in.nextDouble();
		}
		for(int i=0;i<myList.length;i++) {
			
			sum=sum+myList[i];
		}
		double avg;
		avg=sum/10;
		System.out.println(Arrays.toString(myList));
		System.out.println(avg);

	}

}
