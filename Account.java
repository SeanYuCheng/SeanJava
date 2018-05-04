package wycthestudyofjava;

public class Account {
	private double Balance;
	public Account(double initialBalance) {
		if (initialBalance > 0)
		{
			Balance = initialBalance;
		}
		}
	public void credit(double Amount) {
		Balance += Amount;
	}
	public double getBalance(){
		return Balance;
	}
	
	}


