package tw.com.code.demo;

public class Dem06 {
	//int[] a =
	//可存取多數同型態
	//index為索引值 從0開始
	//Value為值 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {10,5,2,8,4,36};
		meth01();
		meth02();
		meth03();
		
	}
	//test1，5%使用率
	public static void meth01()
	{
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr);//記憶體位置
		myPrint(arr);
	}

	//test2，10%使用率
	public static void meth02()
	{
		int[] arr = new int[] {10,20,30,40,50,60,70};
		myPrint(arr);
	}
	//test3，85%使用率
	public static void meth03()
	{
		int[] arr = {1,20,30,40,50,60};
		myPrint(arr);
	}
	//列印方法
	public static void myPrint(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
