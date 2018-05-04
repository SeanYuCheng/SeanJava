package wycthestudyofjava;

import java.util.Arrays;

public class 随机输出 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rando[]=new int[8];
		for(int i=0;i<rando.length;i++)
		{
			rando[i]=(int) (Math.random()*100);

		}
		for(int i =0;i<rando.length;i++)
		{
			for(int j =0;j<rando.length-1;j++)
			{
				if(rando[j]>rando[j+1])
				{   
					int mid;
					mid=rando[j];
					rando[j]=rando[j+1];
					rando[j+1]=mid;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(rando));

	}

}
