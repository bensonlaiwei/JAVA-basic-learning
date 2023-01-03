package tw.com.lccnet.code;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

/*
 * 
 * 解Bug 
 * 1.可以用抓取的方式
 * 
 * 異常的使用(繼承問題)
 * 1. RruntimeException 需要自行加入抓或拋得異常處理
 * 2. 會要求進行自動要求進行異常處理
 * 		網路、資料庫、檔案
 * 
 * 
 */


public class Demo04 {
	
	
	@Test
	public void getDB(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {//SQLException可以用他的父類別，子類別不行
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@Test
	public void test01(){
		try {
			int a=10/0;//exception停止運行
			System.out.println(a);//不運行
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//顯示錯誤
			e.printStackTrace();
		}
	}

}
