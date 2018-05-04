
public class Pizza {
	private String name;
    private int size;
    private int price;
    private static int count=0;
    public Pizza(String name ,int size, int price)
    {
    	this.name = name;
    	this.size = size;
    	this.price = price;
    	count++;
    }
    public String getName()
    {
    	return name;
    }
    public int getSize()
    {
    	return size;
    }
    public int price()
    {
    	return price;
    }
    public void count()
    {
    	count++;
    }
    public static int getCount()
    {
    	return count;
    }
    

	

}
