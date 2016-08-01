package com.hand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("请输入日期：");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.next();
		int temp;
		int m1 = (int)date.charAt(5) - 48;
		int m2 = (int)date.charAt(6)- 48;
		int d1 = (int)date.charAt(8)- 48;
		int d2 = (int)date.charAt(9)- 48;
		if(m1 == 0){
			temp = (m2-1)*30+d1*10+d2;
		}
		else{
			temp = (9+m2)*30+d1*10+d2;
		}
		
		System.out.println("你输入的日期为当年的第"+temp+"天");
	}

}
