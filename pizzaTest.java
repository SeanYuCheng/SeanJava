import java.util.ArrayList;

public class pizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza[]=new Pizza[4];
		pizza[0]= new Pizza("Mushroom",11,110);
		pizza[1]= new Pizza("Cheese",13,120);
		pizza[3]= new Pizza("Cheese",13,120);
		pizza[2]= new Pizza("Cheese",13,120);
		for(Pizza e:pizza)
		{
			System.out.printf("%s,%d,%d",e.getName(),e.getSize(),e.getCount());
		}
		
		

	}

}
