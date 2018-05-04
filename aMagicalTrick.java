import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class aMagicalTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] fib = new int[10];
		ArrayList<Integer[]> reserve = new ArrayList();
		int times;
		int mid1;
		fib[0] = 1;
		fib[1] = 2;
		int number1 = fib[0];
		int number2 = fib[1];
		for (int n = 0; n < fib.length; n++) {
			fib[n] = number1;
			int mid;
			mid = number2;
			number2 = number2 + number1;
			number1 = mid;

		}
		times = in.nextInt();
		// input the number of times of the test
		int[] input = new int[times];
		for (int i = 0; i < times; i++) {
			input[i] = in.nextInt();
		}
		for (int i = 0; i < times; i++) {
			// input the test number
			if(input[i]>0) 
			{
			for (int j = input[i]; j > 0; j--) {
				mid1 = j;
				ArrayList<Integer> midArray = new ArrayList<Integer>();
				for (int k = 9; k > -1; k--) {
					if (mid1 >= fib[k]) {
						midArray.add(fib[k]);
						mid1 = mid1 - fib[k];
					}
				}
				int size = midArray.size();
				Integer[] store = (Integer[]) midArray.toArray(new Integer[size]);
				reserve.add(store);
				break;
			}
			}
			else
				reserve.add(new Integer[0]);
			
		}
		for(int i=0;i<times;i++)
		{
			String output = "";
			if(input[i]<=100&&input[i]>0)
			{
				Arrays.sort(reserve.get(i));
				for(Integer e:reserve.get(i)) {
				output=output + e.toString()+" ";
				}
				System.out.println(output.trim());
			}
			else
				System.out.println("Invalid Number");
		}

	}

}
