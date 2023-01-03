package tw.com.lccnet.code;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method01();// static靜態方法只能呼叫相同的static
//		method02();//呼叫一般方法，無法呼叫
		Demo01.method01();//可以使用類別接方法
	}
	//靜態方法
	public static void method01()
	{
		System.out.println("靜態方法 static");
	}
	
	public void method02()
	{
		System.out.println("一般方法");
	}

}
