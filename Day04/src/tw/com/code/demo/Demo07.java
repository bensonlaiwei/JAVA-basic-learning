package tw.com.code.demo;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用一個類別監聽鍵盤輸入內容
		Scanner keyin = new Scanner(System.in);
		//透過a來接收鍵盤輸入的數字
		System.out.println("請輸入a值");
		int a = keyin.nextInt();
		System.out.println("請輸入b值");
		int b = keyin.nextInt();
		
		if (a>b) {
			System.out.println("a大於b");
		}
		else if(a==b){
			System.out.println("a==b");
		}
		else if(a<b){
			System.out.println("a<b");
		}
		
		else if(a!=b){
			System.out.println("a!=b");
		}
		
		else {
			System.out.println("");
		}
		//關閉類別監聽
		keyin.close();
		
	}

}
