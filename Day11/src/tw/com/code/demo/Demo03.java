package tw.com.code.demo;

public class Demo03 {

	//外部類別有的結構，內部類別也有
	private class Inner {
		
		public Inner() {
			
		}
		public void method() {
			
		}
		
		//內部類別可以加內部類別，但不會有人這樣寫
		private class AA{
			
		}
		
	}
}
