
public class generateString {
	static final int SIZE=50000;
	static final int RENGE=100000;
	public static void test_Integer()
	{
		for(int i=0;i<SIZE;i++)
		{
			System.out.print((int)Math.random()*RENGE+"\t");	
			if(i%10==0)
			{
				System.out.println();
			}
		}
		
	}

}
