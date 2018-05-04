import java.util.Random;

public class 字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apple";
		String s2 = s1 + "";
		System.out.println(s1.equals(s2));
		// String builder
		Random a = new Random();
		int v = a.nextInt(10);
		System.out.println(v);
		StringBuilder budder1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder budder3 = new StringBuilder("hello");
        //append
		char[]e=new char[] {'1','2','3'};
		buffer2.append("fuck");
		buffer2.append('a');
		buffer2.append(2.2);
		buffer2.append(e,0,3);
		System.out.println(buffer2);
		
	}

}
