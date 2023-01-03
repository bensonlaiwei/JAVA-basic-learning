package tw.com.code.demo;

public class Demo07 {
//稱之為泡沫排序法;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,5,3,8,20,12,50};
//		int temp = 0;
		System.out.println(arr);
		System.out.println("------------");
		for(int i = 0 ; i<arr.length-1;i++)
		{
			for(int j = 0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		System.out.println("轉換果");
		for (int i =0 ; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
