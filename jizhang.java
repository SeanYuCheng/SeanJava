package wycthestudyofjava;

import java.util.Scanner;

public class jizhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int type;
		double money;
		double totalMoney=0;
		int n;
		System.out.println("输入类型：");
		type = in.nextInt();
		while(type != -1)
		{switch(type)
		{ 
		case 1:System.out.println("输入个数：");
        n = in.nextInt();
		money = n * 6.1;
		totalMoney = totalMoney + money;
		break;
		case 2:System.out.println("输入个数：");
        n = in.nextInt();
		money = n * 5.8;
		totalMoney = totalMoney + money;
		break;
		case 3:System.out.println("输入个数：");
        n = in.nextInt();
		money = n * 2.38;
		totalMoney = totalMoney + money;
		break;
		case 4:System.out.println("输入个数：");
        n = in.nextInt();
		money = n * 3.8;
		totalMoney = totalMoney + money;
		break;
		case 5:System.out.println("输入个数：");
        n = in.nextInt();
		money = n * 2.08;
		totalMoney = totalMoney + money;
		break;
		default:System.out.println("请输入一到五之间的值");
		break;
		
		}
		System.out.println("请输入类型");
		type = in.nextInt();
		}
		System.out.println("总金额为： "+totalMoney);
        
	}

}
