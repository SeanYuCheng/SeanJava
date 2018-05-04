package wycthestudyofjava;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[]dice=new int[36000000];
	   int[]count=new int[11];
	   for(int i=0;i<count.length;i++) {
		   count[i]=0;
	   }
	   for(int i=0;i<dice.length;i++) {
		   int a=(int)(Math.random()*6)+1;
		   int b=(int)(Math.random()*6)+1;
		   dice[i]=a+b;
	   }
	   
		   for(int j=0;j<dice.length;j++) {
			   count[dice[j]-2]++;
			   
				   
		   
	   }
		  for(int a:count)
		  {
			  System.out.println(a);
		  }
	   

	}

}
