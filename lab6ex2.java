import java.util.Arrays;

public class lab6ex2 {

	public static double [][] matrixProduct(double[][]a,double[][]b) {
		// TODO Auto-generated method stub
		
		int i = a.length;
		int j = b[0].length;
		double[][] c=new double[i][j];
		for(int k=0;k<a.length;k++)
		{
			for(int l=0;l<b[0].length;l++)
			{
				for(int m=0;m<a[0].length;m++)
				{
					c[k][l]=c[k][l]+a[k][m]*b[m][l];
				}
			}
		}
		return c;
		

	}
	public static void main(String[]args) {
		double[][]a= {{1,2,3,4},{2,1,3,1},{1,2,3,4}};
		double[][]b= {{1,2,3},{2,1,3},{1,2,3},{1,2,3}};
		for(int i=0;i<b[0].length;i++)
		{
		System.out.println(Arrays.toString(matrixProduct(a,b)[i]));
		}
	}

}
