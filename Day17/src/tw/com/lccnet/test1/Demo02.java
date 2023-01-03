package tw.com.lccnet.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/*
 * 	
 * List<參考型態(限定型態)>List<> list = new ArrayList<可以不寫，它會自動參考前面的型態>();
 * 限定型態是依據19行給的型態賦予的
 */


public class Demo02 {

	@Test
	public void test01() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		 Object[] ii =  list.toArray();
		 
		 for(Integer u:list) {
			 System.out.println(u);
		 }
		
		
		
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(list.size());
	}
	
}
