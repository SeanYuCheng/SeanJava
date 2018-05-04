
public class FieldString {
	private StringBuffer orignalStr;
	public void setOrignalStr(StringBuffer orignalStr)
	{
		this.orignalStr=orignalStr;
	}
	public StringBuffer genToString()
	{
		String s1 = this.orignalStr.toString().replaceAll("[\\s]{1,}", " ");
		String []s=s1.split(" ");
		StringBuffer result = new StringBuffer();
		for(String ss :s)
		{
			result.append(s);
			result.append("\t*\t");
		}
		return result;
	}
     public FieldString() {}
     public FieldString(String string) 
     {
     }
     
     

}
