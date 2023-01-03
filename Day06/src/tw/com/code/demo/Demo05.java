package tw.com.code.demo;

public class Demo05 {
	//靜態方法 static 只能呼叫為static的方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getNum();
		System.out.println(getNum());
	}
	public static String getNum()
	{
		int a = 3;
		switch(a) {
			case 1:
				
				return "1";
			case 3 :
				return "3";
			case 5 :
				return "5";
			case 7 :
				return "7";
		}
		return "";
	}

}
