package wycthestudyofjava;

import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    double pi=0;
	    for(int counts=1;counts <=a;counts++)
	    {
	    	pi= pi +(Math.pow(-1, counts+1))*4/(1+2*(counts-1));
	    }
	    System.out.println("pi="+pi);
		
		
	    

	}

}
