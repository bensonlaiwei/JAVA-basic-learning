package tw.com.lccnet.code;

import org.junit.Test;

public class Demo02 {
	
	private String values="this is my benson";
	private StringBuffer valuesbuffe ;
	
	
	
	@Test
	public void test13() {
		valuesbuffe = new StringBuffer();
		valuesbuffe.append("afwfw--------------");
		valuesbuffe.reverse();
		valuesbuffe.replace(0, 0, values);
		
		System.out.println(valuesbuffe);
	}
	
	
	
	
	@Test
	public void test12() {
		valuesbuffe = new StringBuffer();
		valuesbuffe.append("AA").append("dot").toString();
		System.out.println(valuesbuffe);
	}
	
	
	
	
	
	
	
//	@Test
	public void test11() {
		System.out.println(values.charAt(6));//為要取的索引位置
	}
	
//	@Test
	public void test10() {
		System.out.println(values.indexOf("b",3));//從第三個位置開始找
	}
	
	
//	@Test
	public void test09() {
		System.out.println(values.indexOf(3));//找尋回傳索引值，沒找到會回傳-1
	}
	
	
	
	
	
//	@Test
	public void test08() {
		System.out.println(values.trim());//刪除字首跟字尾空白
	}
	
//	@Test/
	public void test07() {
		System.out.println(values.concat("FFFFF"));//在後方新增字串
	}
	
//	@Test
	public void test06() {
		System.out.println(values.replace('b','g'));//替換字母
	}
	
//	@Test
	public void test05() {
		System.out.println(values.substring(5,10));//從索引值5-10個開始
	}
	
//	@Test
	public void test04() {
		System.out.println(values.substring(10));//從索引值地10個開始
	}
//	@Test
	public void test03() {
		System.out.println(values.toUpperCase());//轉大寫
	}
	
	
//	@Test
	public void test02() {
		System.out.println(values.toLowerCase());//轉小寫
	}
	
	
	
	
//	@Test
	public void test01() {
		System.out.println(values.length());
	}

}
