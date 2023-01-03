package tw.com.code.demo;

public class Demo01 {
	//陣列一經初始化，就無法改變長度跟內容

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {2,6,8,9,7,6,5,9};
//		arr=;
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
