package tw.com.code.model1;

/*
 * 父類別
 */

//如果有加上final就無法繼承
public class F_Class {
	
//	//空參數建構子
//	public F_Class(){
//		
//	}
//	//有傳入參數的建構子
//	public F_Class(int y ){
//			
//	}
//	//有傳入參數的建構子
//	public F_Class(int x,int y ){
//			
//	}
//	
	
	private int id;
	private String name;
	public F_Class(int id, String name) {
		//super與this都要求放置第一行，因此只能使用一個
		super();
		this.id = id;
		this.name = name;
	}
	//static方法無法複寫
	public static void method() {
		
	}
	
	
	
}
