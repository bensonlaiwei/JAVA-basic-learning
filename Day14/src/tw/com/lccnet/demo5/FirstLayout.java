package tw.com.lccnet.demo5;

/*
 * 
 * 第一層(資料庫的基本功能)
 * 新增
 * 刪除
 * 更新
 * 搜尋
 * 
 * 
 */


public interface FirstLayout {
	//新增
	public void add(Student st);
	
	//刪除
	public void delete(int id);
	
	//更新
	public void updata(int id);
	//搜尋
	public void seach(int id);
	
}
