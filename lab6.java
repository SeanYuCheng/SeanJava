import java.util.ArrayList;

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList <String> ();
		printList(list);
		list.add("ass");
		printList(list);
		list.add("we");
		list.add("can");
		list.add(1,"wanna");
		printList(list);
		System.out.println((int)-7.4);
		
		
		
		

	}

	private static void printList(ArrayList<String> list) {
		// TODO Auto-generated method stub
		for(String a:list) {
			System.out.printf("%s\n",a);
		}

		
		
	}

}
