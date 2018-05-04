import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		Scanner in =new Scanner(System.in);
		ArrayList<Double>list=new ArrayList();
		System.out.println("Input row");
		int i=in.nextInt();
		System.out.println("Input column");
		int j=in.nextInt();
		double [][]a=new double [i][j];
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[0].length;l++) {
				a[k][l] =in.nextDouble();
			}
		}
		int c,b;
		System.out.println("Input new row");
		b = in.nextInt();
		System.out.println("Input new column");
		c = in.nextInt();
		double[][]arr=new double[b][c];
		while(true) {
		if(i*j==c*b) {
			for(int x=0;x<a.length;x++)
			{
				for(int y=0;y<a[0].length;y++)
				{
					list.add(a[x][y]);
				}
			}
			for(int x=0;x<arr.length;x++)
			{
				for(int y=0;y<arr[0].length;y++)
				{
					arr[x][y]=list.get(counter);
					counter++;
				}
			}
			break;
			
			
		}
		else {
			System.out.println("Please Input legal row and column");
			}
		}
		for(int x=0;x<arr.length;x++)
		System.out.println(Arrays.toString(arr[x]));

	}

}
