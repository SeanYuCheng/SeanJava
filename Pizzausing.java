import java.util.ArrayList;
import java.util.Scanner;

public class Pizzausing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner in = new Scanner(System.in);
		ArrayList<Pizza>pizza=new ArrayList<Pizza>();
		
		
		while (true)
		{
			String piza = new String();
			System.out.println("you want one?1/0");
			s=in.nextInt();
			String blank = in.nextLine();
			if(s==1)
			{
				piza = in.nextLine();
				String str[]=piza.split(",");
				Pizza piz = new Pizza(str[0].trim().toUpperCase(),Integer.valueOf(str[1].trim()),Integer.valueOf(str[2].trim()));
				pizza.add(piz);
			}
			else if (s==0)
			{
				break;
			}
			else
			{
				System.out.println("please input valid number");
			}
		}
		for(int i=0;i<pizza.size();i++)
		System.out.printf("name:[%s],size:[%d],prize[%d]\n",pizza.get(i).getName(),pizza.get(i).getSize(),pizza.get(i).price());
		

	}

}
