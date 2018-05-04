
public class methods {
	public static double average(double... numbers)
	{
		double total=0.0;
		for(double d : numbers)total += d;
		return total/numbers.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(1,2,3,4,1,2,3,4,2,3,5,6,1));

	}

}
