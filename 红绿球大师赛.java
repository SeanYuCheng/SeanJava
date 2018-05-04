package wycthestudyofjava;

import java.util.Arrays;

public class 红绿球大师赛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ball=new int[30];
		for(int i=0;i<ball.length;i++)
		{
			ball[i]=1;
		}
		int count1=0;
		int count2=0;
		for(int i =0;i<15;i++)
		{   count1=0;
			while(count1<13)
			{
				
				if(count2==30)
					{count2=0;}
				if(ball[count2]!=0)
				{
					count1++;
				}
				
				if(count1==13)
				    {ball[count2]=0;
				    
				    }
				count2++;
					
				
				
			}
		}
		
		System.out.println(Arrays.toString(ball));
	}					

}
