package wycthestudyofjava;

import java.util.Arrays;
import java.util.Scanner;

public class lab44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 int[]arr=new int [0];
	 int[]newarr=new int[0];
	 int[]count=new int[101];
     for(int i=0;i<count.length;i++) {
    	 count[i]=0;
     }
     Scanner in= new Scanner(System.in);
     int a;
     a=in.nextInt();
     while(a!=0) {
     arr=new int[newarr.length+1];
	 System.arraycopy(newarr, 0, arr, 0, newarr.length);
	 arr[newarr.length]=a;
	 newarr=arr;
	 a=in.nextInt();
     
     }
     System.out.println(Arrays.toString(arr));
     for(int j=0;j<101;j++) {
     for(int i=0;i<arr.length;i++) {
    	 if(j==arr[i])
    		 count[j]++;
    	 
    		 
    		
    	 
     }

     }
     for(int i=0;i<100;i++)
     {
    	 if(count[i]!=0)
    	 {
    		 System.out.println(i+"\t"+count[i]);
    	 }
     }
     
     
		
		
		

	}

}
