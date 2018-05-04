import java.util.ArrayList;
import java.util.Random;

public class Lab6ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int a;
		int counter = 0;
		ArrayList<Integer> list = new ArrayList();
		while (true) {
			counter++;
			a = random.nextInt(10) - 5;
			System.out.print("the number is :" + a + "\n");
			switch (a) {
			case 0:
				break;
			case 1:
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) > 0) {
						list.remove(i);
						i--;

					}

				}
				System.out.println(list.toString());
				break;
			case -1:
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) < 0) {
						list.remove(i);
						i--;

					}

				}
				System.out.println(list.toString());
				break;
			case 5:
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < list.size() - 1; j++) {
						if (list.get(j) > list.get(j + 1)) {
							int mid;
							mid = list.get(j);
							list.set(j, list.get(j + 1));
							list.set(j + 1, mid);

						}
					}
					System.out.println(list.toString());

				}
				break;
			case -5:
				System.out.println(list.size());
				break;
			default:
				list.add(a);
				break;
			}
			if (a == 0) {
				System.out.print(counter);
				break;
			}

		}

	}

}
