package tw.com.code.demo;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//取的array最大值
		int[] arr = {9,5,3,8,20,12,50};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		//取得array累加
		int sum = 0;
		for(int i = 0;i < arr.length ; i++ )
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		
		//平均
		int avg;
		avg =sum/arr.length;
		System.out.println(avg);
		
		System.out.println("-------------------複製------");
		//array複製
		int []arr11 = new int[arr.length];
		for(int i = 0 ; i<arr11.length; i++)
		{
			arr11[i] = arr[i];
			System.out.println(arr11[i]);
		}
		
		System.out.println("============反轉===========");
		
		for(int i = 0 ; i<arr.length/2;i++)
		{
			//最前跟最後
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------------");
		
		
	}

}
