package tw.com.lccnet.test;


/*
 * try{}catch(){} 抓
 * Throows 拋
 * throw 自行拋
 * 
 */


public class Demo05 {
	
	public void test01(int u ) throws Exception{ //父
		if(u==0) {
			int f=10/u;
			
		}
		else {
			//自行拋異常
			throw new RuntimeException();//子
		}
	}

}
