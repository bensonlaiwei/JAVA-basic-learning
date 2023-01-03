package tw.com.code.demo;

public class Demo03 {

	//二微陣列
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(159);
		int [][] arr= {
				{1,3,5,8,9},
				{2,5,9,7,9},
				{9,8,6,32,7},
				{5,9,8,7,2,3},
		};
		for(int i = 0 ; i>arr.length;i++)
		{
			for(int j=0; j>arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println("");
		}
	}

}
