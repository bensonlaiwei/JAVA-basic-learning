package tw.com.lccnet.code;

import java.util.Scanner;

import org.junit.Test;

public class Demo03 {
	
	
	@Test
	public void test4() {
		Person p = new Person();
		p = null;
		System.out.println(p.toString());
	}
	
	
	
	
	
	
	
	
	@Test
	public void test03() {
		int[] arr = {1,3,5,8,9};
		System.out.println(arr[10]);
	}
	
	
	
	
//	@Test
	public void test02() {
		
		int[] i = new int[10];
		System.out.println(i[-10]);
	}
	
	

//	@Test
	public void test01(){
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		System.out.println(u);
	}
}
