import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] fib = new int[10];
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
			ArrayList<Integer[]> reserve = new ArrayList();
			// input the test number

			for (int j = input[i]; j > 0; j--) {
				mid1 = j;
				ArrayList<Integer> midArray = new ArrayList();
				for (int k = 9; k > -1; k--) {
					if (mid1 >= fib[k]) {
						midArray.add(fib[k]);
						mid1 = mid1 - fib[k];
					}
				}
				int size = midArray.size();
				Integer[] store = (Integer[]) midArray.toArray(new Integer[size]);
				reserve.add(store);

			}
			for (int a = 0; a < 10; a++) {
				String d = "";
				if (input[i] >= fib[a]) {
					System.out.printf("Card #%d: ", a + 1);
					for (int b = input[i] - 1; b > -1; b--) {
						for (int c : reserve.get(b)) {
							if (c == fib[a]) {
								d = d + (reserve.size() - b) + " ";
							}
						}
					}
					System.out.println(d.trim());
				}

			}

		}

	}

}
