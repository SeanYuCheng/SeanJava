package 类和方法;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTrans {
	Scanner in= new Scanner(System.in);
	private double [][]Matrix;
	public void getMatrix(int i,int j) {
		double [][]matrix=new double[i][j];
		for(int j1=0;j1<matrix.length;j1++) {
			for(int i1=0;i1<matrix[0].length;i1++) {
				matrix[j1][i1]=in.nextDouble();
			}
		}
		Matrix=matrix;
	}
	public double[][] Trans(){
		for(int i1=0;i1<Matrix.length;i1++) {
			for(int j1=0;j1<=i1;j1++) {
				double mid;
				mid=Matrix[i1][j1];
				Matrix[i1][j1]=Matrix[j1][i1];
				Matrix[j1][i1]=mid;
			}
		}
		return Matrix;
		
	}
	public void getMatrixTrans() {
		for(int i2=0;i2<Matrix.length;i2++)
		System.out.println(Arrays.toString(Matrix[i2]));
	}

}
