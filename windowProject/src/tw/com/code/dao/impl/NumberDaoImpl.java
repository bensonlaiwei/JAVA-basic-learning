package tw.com.code.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tw.com.code.bean.NumberBean;
import tw.com.code.dao.NumberDao;
import tw.com.code.utils.DBUtils;

public class NumberDaoImpl implements NumberDao {

	@Override  //ProductBean，EmployeeBean PersonBean
	public void add(NumberBean nb) {
		//1.連線資料庫
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		
		try {
			conn =  DBUtils.getDB().getConn();
			//2.傳送SQL語法
			String sql = "insert into numberbean(pName,pPassword,pAge,pEmail,pAddress)values(?,?,?,?,?);";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, nb.getpName());
			ps.setString(2, nb.getpPassword());
			ps.setString(3, nb.getpAge());
			ps.setString(4, nb.getpEmail());
			ps.setString(5, nb.getpAddress());
			
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.getDB().close(conn);
			DBUtils.getDB().close(ps);
		}
		
		
	}

	@Override
	public void updata(int pId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int pId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int pId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NumberBean search(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

}
