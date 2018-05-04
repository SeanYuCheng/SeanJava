

public class Time {

	private int hour,minute,second;
 public void settime(int h,int m,int s){
		// TODO Auto-generated method stub
	 hour=((h>=0&&h<24)?h:0);
	 minute=((m>=0&&m<60)?m:0);
	 second=((s>=0&&s<60)?s:0);
	 

	 

	}
 public String toUniversalString() {
	 return String.format("%d:%d:%d",hour,minute,second );
	 
 }
 public String BuildString()
 {
	 return "yeah"+toUniversalString();
 }

}
