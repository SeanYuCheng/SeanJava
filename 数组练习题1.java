package wycthestudyofjava;

import java.util.Arrays;
import java.util.Scanner;

public class 数组练习题1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		array arr = new array();
		int s=1;
		arr.add(s);
		int []a=arr.getArr();
	    System.out.println(Arrays.toString(a));
	    int sum=0;
	    double avg;
	    for(int i =0;i<a.length;i++) {
	    	sum=sum + a[i];
	    }
	    avg = sum/a.length;
	    System.out.println(avg);
	    for(int j =0;j<a.length;j++) {
	    	if(a[j]>avg)
	    		System.out.print(a[j]+"  ");
	    }
	    
		
		}
        

	}


