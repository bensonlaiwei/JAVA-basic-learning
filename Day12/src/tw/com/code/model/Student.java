package tw.com.code.model;

public class Student extends Person{
	
	
	//使用複寫父類別方法
	
	
	public void read() {
		System.out.println("student-------------read");
	}

	@Override //使用複寫父類別
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Students------------sleep");
	}

	@Override //使用複寫父類別
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

}
