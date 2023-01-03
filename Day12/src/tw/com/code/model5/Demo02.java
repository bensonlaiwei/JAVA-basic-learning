package tw.com.code.model5;

import tw.com.code.model4.Bean;




public class Demo02 {
	
	public void method() {
		Bean b1 = new Bean();
		
//		System.out.println(b1.id);//private
//		System.out.println(b1.name);//protected
//		System.out.println(b1.email);//Default
		System.out.println(b1.age);//public
	}

}
