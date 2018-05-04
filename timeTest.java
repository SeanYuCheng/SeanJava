
public class timeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time now = new Time();
		now.settime(11, 12, 50);
		System.out.print(now.toUniversalString());
		System.out.print(now.BuildString());

	}

}
