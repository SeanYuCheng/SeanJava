package wycthestudyofjava;


 
import java.util.Scanner;
public class guessingnumber {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		int magicNum = random.nextInt(10);
		Scanner in = new Scanner(System.in);
		int guess;
		guess = in.nextInt();
		while (guess != magicNum)
		{
			System.out.println("your number is " + guess);
			System.out.println("please try again");
			guess = in.nextInt();
		}
		System.out.println("you are right\n the number is " + magicNum);

	}

}
