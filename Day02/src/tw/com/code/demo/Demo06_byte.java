package tw.com.code.demo;

/**
 * 
 * @author pas90
 *TODO:
 *基本型態(變數)
 *型態 變數名稱 = 初始化值
 */


public class Demo06_byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//型態 變數名稱=初始化值(可接受值的範圍-128~127)
		byte b1 = -128;//變數(可變之數)
		System.out.println(b1);
//		byte b1=20;不同變數，但名稱在同一個class內中的方法不能重複
		b1 = 20 ; //重新附值
		System.out.println(b1);
		System.out.println("------------------------------------");
		//0~255
		byte s1 = 10;
		byte s2 = 10;
		//第一種計算s1+s2存放在temp區 沒有記憶體限制
		System.out.println(s1+s2);
		
		System.out.println("-----------------byte計算會有問題，因為預設問提-------------------");
		/*
		 * 1.先乘除後加減，括弧內先計算(int)
		 * 2.將計算後結果強轉為byte
		 */
		Byte total =(byte)(s1+s2); //因為計算所以byte轉到int
		System.out.println(total);
		
		
		System.out.println("----------------如果數值超過會如何-------------------");
		byte t1 = 127;
		byte t2 = 2 ;
		byte all = (byte)(t1+t2);
		System.out.println(all);//為甚麼會變成-127，因為會變成重新計算 所以-128 -127 
		
		
		
		
	}

}
