package tw.com.code.model;

public class Worker extends Person{
	
	
	//複寫父類別
	
	
	public void work() {
		System.out.println("Worker-------------work");
	}

	@Override // 複寫父類別
	public void sleep() {
		// TODO Auto-generated method stub
		//super代表父類別eat
		super.sleep();
	}

	@Override// 複寫父類別
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}
