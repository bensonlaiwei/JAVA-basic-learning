package tw.com.code.demo;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,6,5,8,9};
		int total = 0;
		for(int i=0; i<arr.length;i++)
		{
//			System.out.println(arr[i]);
			total+=arr[i];
			
		}
		System.out.println(total);
		
		System.out.println("=====================");
		
		int total1 = 0;
		
		int [][] arr1= {
		{1,3,5,8,9},
		{2,5,9,7,9},
		{9,8,6,32,7},
		{5,9,8,7,2,3},
		};
		for(int i = 0 ; i<arr1.length;i++)
		{
			for(int j=0; j<arr1.length;j++)
			{
//				System.out.println(arr1[i][j]);
				total1+=arr1[i][j];
			}
			System.out.println("");
			System.out.println(total1);
		}
		
	}

}
