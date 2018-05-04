import java.util.Calendar;

public class MyTime {
private int hour;
private int minute;
private int second;
public MyTime(int hour,int minute,int second)
	{
	if(hour>=0&&hour<=23)
	{
		this.hour=hour;
	}
	else
		this.hour=0;
	if(minute>=0&&minute<=23)
	{
		this. minute=minute;
	}
	else
		this.minute=0;
	if(second>=0&&second<=23)
	{
		this.second=second;
	}
	else
		this.second=0;
	}
    
public void setHour(int hour)
	{
	if(hour>=0&&hour<=23)
	{
		this.hour=hour;
	}
	else
		this.hour=0;
	}
public void setMinute(int minute)
	{
	if(minute>=0&&minute<=23)
	{
		this. minute=minute;
	}
	else
		this.minute=0;
	}
public void setSecond(int second)

	{
	if(second>=0&&second<=23)
	{
		this.second=second;
	}
	else
		this.second=0;
	}

public int getHour()
    {
	return hour;
	}
public int getMinute()
	{
return minute;
	}
public int getSecond()
	{
return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,m,s;
		MyTime mytime=new MyTime(10,20,45);
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.printf("current time:%d:%d:%d\n",hour,minute,second);
		System.out.printf("input time:%d:%d:%d\n",mytime.getHour(),mytime.getMinute(),mytime.getSecond());
		if(second>=mytime.getSecond())
		{
			s=second-mytime.getSecond();
		}
		else
		{
			s=second+60-mytime.getSecond();
			minute--;
		}
		if(minute>=mytime.getMinute())
		{
			m=minute-mytime.getMinute();
		}
		else
		{
			m=minute+60-mytime.getMinute();
			hour--;
		}
		if(hour>=mytime.getHour())
		{
			h=hour-mytime.getHour();
		}
		else
		{
			h=hour+24-mytime.getHour();
		}
		System.out.printf("difference:%d:%d:%d\n", h,m,s);
		
		
		

	}

}
