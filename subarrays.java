package 类和方法;

public class subarrays {

	public static int[] cut(int left,int right, int array[]) {
		int []midarr=new int [right-left+1];

		System.arraycopy(array, left, midarr, 0, right-left+1);

		
		
			
		
		return midarr;
        
        

	}

}
