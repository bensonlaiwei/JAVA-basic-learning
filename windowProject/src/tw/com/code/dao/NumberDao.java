package tw.com.code.dao;

import tw.com.code.bean.NumberBean;

/*
 * 這是個抽象類別
 * 對資料有4種方式
 * 新增
 * 刪除
 * 更新
 * 搜尋
 * 
 * 
 */


public interface  NumberDao {
	public abstract void add(NumberBean nb);
	
	public abstract void add(int pId);
	
	public abstract void updata(int pId);
	
	public void delete(int pId);
	
	public NumberBean search(int pId);
	
	
}
