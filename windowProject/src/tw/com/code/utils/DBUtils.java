package tw.com.code.utils;
/*
 * 連接資料庫
 * JDBC
 * Java Se
 * Java Web
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 資料庫用於實例
 * JDBC說明
 * 1. Connection 進行程式與資料庫的位址、帳號、密碼連接與驗證<br>
 * 2. PreparedStatement 用途:將程式碼中的SQL 傳進資料庫進行查詢，安全性較高(部會被(SQL注入)攻擊)<br>
 * 3. Statement 用途:將程式碼中的SQL 傳進資料庫進行查詢，有可能成SQL注入攻擊<br>
 * 4. ResultSet 用途: 將資料庫查詢到的內容，暫放置ResultSet內給程式進行查、存、取<br>
 * 
 * 對檔案，網路，資料庫<Br>
 * 有開有關，掀開後關
 * Java Se<br>
 * Java Web
 */



public class DBUtils {
	//常數
	//JDBC driver (資料庫連結Driver)
	private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	/*
	 * jdbc對mysql做連結
	 * 資料庫連接位置(localhost:本機)
	 * 3306:資料庫的port號
	 * dbName : 資料庫名稱
	 * 
	 */
	
	private final String JDBC_URL="jdbc:mysql://localhost:3306/windowproject?useSSL=false&serverTimezone=UTC";
	//資料庫帳號 root(最高權限)
	private final String JDBC_NAME="root";
	//資料庫密碼(個人資料庫密碼)
	private final String JDBC_PASS="$RFV5tgb^YHN";
	//屬性
	private Connection conn;
	
	
	//私有化建構子(無法建立實體)
	private DBUtils() {
		//首字母要大寫，建構子建構這個class時載入driver
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 不能讓其他class建立實體，這個class就變成廢類別
	 * 我建立好實體提供給有需要的class
	 * 用static的方法，呼叫方式為class.method
	 */
	
	public static DBUtils getDB() {
		System.out.println("db");
		return new DBUtils();
		
	}
	//回傳Connection
	public Connection getConn() {
		
		try {
			DriverManager.getConnection(JDBC_URL, JDBC_NAME,JDBC_PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public void close(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
