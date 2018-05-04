package wycthestudyofjava;

import java.util.Scanner;

public class Average {
	private double average;
	public Average(double mid1){
		average = mid1;
	}
	public void add(double Input,double sum)
	{   
		int j=0;
		Scanner in = new Scanner(System.in);
		Input = in.nextDouble();
		while (Input>=0) {
			j++;
			sum += Input;
			Input = in.nextDouble();
		}
		average = sum / j;
		
		
		
	}
	public double getaverage(){
		return average;
	}
	
	
	
	
	
	

}
