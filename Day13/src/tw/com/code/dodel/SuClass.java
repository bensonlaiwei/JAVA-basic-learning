package tw.com.code.dodel;

public class SuClass extends FuClass {
	
	public void eat() {
		System.out.println("Su==========");
	}
	//複寫父類別的方法

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
//		super.sleep();
		System.out.println("子類別內容");
	}
	
}
