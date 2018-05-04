package wycthestudyofjava;

import java.util.Scanner;

public class scannner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		double score = in.nextDouble();
		char level = in.next().charAt(0);
		String name = in.next();*/
		int age1 = Integer.parseInt(args[0]);
		double level1 = Double.parseDouble(args[1]);
		char grade1 = args[2].charAt(0);
		String name1 = args[3];
		System.out.printf("%d,%f,%c,%s", age1,level1,grade1,name1);
		

	}

}
