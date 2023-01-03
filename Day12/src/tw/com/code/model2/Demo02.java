package tw.com.code.model2;





//屬性:同套件，不同類別

public class Demo02 {
	
	public void method() {
		Demo01 d1 = new Demo01();
		System.out.println(d1.name);//保護的
		System.out.println(d1.email);//default
		System.out.println(d1.note); //public
	}

}
