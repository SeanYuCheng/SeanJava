package wycthestudyofjava;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook();
		System.out.printf("Enter course name:");
		String theName = in.nextLine();
		myGradeBook.setCourseName(theName);
		System.out.println();
		myGradeBook.displayMessage();
		

	}

}
