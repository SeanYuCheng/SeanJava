
public class arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++)
		{
			System.out.printf("args%d:%s\n",i+1,args[i]);
			//字符串都是指向，是一个地址
		}
		String s  = "boy next door";
		String d  =s;
		s="ass we can";
		s=s.concat("!");
		System.out.println(s.indexOf('a',2
				));
		
		
		System.out.println(s);

	}

}
