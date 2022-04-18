package com.pxs.shark;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//定义一个字符串，用来接受整个收支的明细
		String details = "";
		//定义一个变量,接收余额
		int balance = 0;
		while(true) {
			System.out.println("------欢迎使用小鲨鱼记账系统--------");//3
			System.out.println("1.收支明细");
			System.out.println("2.登记收入");
			System.out.println("3.登记支出");
			System.out.println("4.退出");
			System.out.println("请输入你要选择的功能: ");
			//拿来一个扫描器
			Scanner sc = new Scanner(System.in);
			//接受键盘录入的int类型的数据
			int choice = sc.nextInt();
			//对录入的choice做一个过滤
			while(choice!=1&&choice!=2&&choice!=3&&choice!=4) {
				System.out.println("对不起，你录入的功能错误，请重新录入");
				int newChoice = sc.nextInt();
				choice = newChoice;
			}
			//根据录入的数字，判断执行对应的功能
			switch(choice) {
				case 1:
					System.out.println("记账系统》》》》收支明细");
					System.out.println(details);
					break;
				case 2:
					System.out.println("记账系统》》》》登记收入");
					System.out.println("请录入输入金额: ");
					int income = sc.nextInt();
					System.out.println("请录入收入说明: ");
					String incomeDetail = sc.next();
					balance += income;
					details =details +"收入: "+ income+",收入说明: "+incomeDetail+",账户余额: "+ balance+"\n";
					break;
				case 3:
					System.out.println("记账系统》》》》登记支出");
					System.out.println("请录入支出金额");
					int expend = sc.nextInt();
					System.out.println("请录入支出说明");
					String expendDetail = sc.next();
					balance -= expend;
					details = details + "支出: "+expend+",支出说明"+ expendDetail+",账户余额："+balance+"\n";
					break;
				case 4:
					System.out.println("记账系统》》》》退出功能");
					return;
			}
		}
	}

}
