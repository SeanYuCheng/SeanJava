 package wycthestudyofjava;

import java.util.Arrays;

public class 数组练习1 {
	public static void main(String [ ]args) {
		int []oldArr = new int[] {1,2,3,0,8,9,6,0,5,6,0,3,4,0,0};
		int []newArr1= new int[oldArr.length];
		System.arraycopy(oldArr,0,newArr1,0,oldArr.length);
		for(int i =0;i<oldArr.length;i++) {
			for(int j=0;j<oldArr.length-1;j++){
				int mid;
				if(newArr1[j]==0) {
				mid = newArr1[j];
				newArr1[j] = newArr1[j+1];
				newArr1[j+1] = mid;
				}
			}}
		int count=0;
	    for (int i1=0;i1<newArr1.length;i1++) {
	    	if(newArr1[i1]>0) {
	    		count++;
	    	}
	    }
		int []newArr =new int [count];
		System.arraycopy(newArr1, 0, newArr, 0, newArr.length);
		System.out.println(Arrays.toString(newArr));
		for(int k=0;k<newArr.length;k++) {
			System.out.print(newArr[k]+" , ");
		}

		System.out.println(Arrays.binarySearch(newArr, 2)+1);
		Arrays.sort(newArr);
	    int [] a =Arrays.copyOf(newArr,  2);
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.equals(newArr,a));
	    for(int element : a)
	    {
	    	System.out.println(element); 
	    }
		
		}
		
	}


