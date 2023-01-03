package tw.com.code.demo;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<10)
		{
			//趴數是取餘數
			if(i%2 == 0 && i%10==0)
			{
				System.out.println(i);
			}else if(i%4==0 && i%8==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
