package wycthestudyofjava;

import java.util.Scanner;

public class 子串的截取 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s = in.next();
		int origin=in.nextInt()-1;
		int l=in.nextInt();
		int q=0;
		char a='d';
	    for(int i=origin;i<origin+l;i++)
	    {
	    System.out.print(s.charAt(i));
	    }
	    System.out.println();
	    for(int i =0;i<s.length();i++)
	    {
	    	if(s.charAt(i)!=a)
	    	{
	    		System.out.print(s.charAt(i));
	    	}
	    }System.out.println();
	    boolean x=true;
	    for(int i=0;i<s.length();i++) {
	    char	p = s.charAt(i);
	    	if(Character.isAlphabetic(p)) {
	    		q++;
	    		
	    	}
	    }
System.out.println(q);
System.out.print(Character.MIN_VALUE);
	}

}
