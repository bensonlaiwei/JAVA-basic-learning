package tw.com.code.dodel;


/*
 * 當繼承抽象類別，需要實作父類別的所有抽象方法
 * 
 * 
 */


public class AbsSuClass extends AbsFuClass {
	public void eat() {
		System.out.println("子類別的eat方法");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		//實作後可以寫子類別的內容
		System.out.println("子類別的sleep方法");
		
	}

	@Override
	public void misic() {
		// TODO Auto-generated method stub
		
	}

}
