package wycthestudyofjava;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(70.5);
		Account account2 = new Account (124.4);
		Scanner in = new Scanner(System.in);
	    double credit1 = in.nextDouble();
	    double credit2 = in.nextDouble();
	    account1.credit(credit1);
	    account2.credit(credit2);
	    System.out.printf("your account1:%.2f", account1.getBalance());
	    System.out.printf("your account2:%.2f", account2.getBalance());
	    
	    
		
		
		

	}

}
