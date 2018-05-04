import java.util.Scanner;

public class Student extends Person {
	Scanner in =new Scanner(System.in);
	private int age;
	private String name;
	public void setname() {
		name=in.next();
	}
	public void setage() {
		age=in.nextInt();
	}
	public String getname()
	{
		return name;
	}
	public int getage() {
		return age;
	}
	
		
	

}
