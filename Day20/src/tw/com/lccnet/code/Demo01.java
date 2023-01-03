package tw.com.lccnet.code;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/*
 * Map<Key,Values> map = new HashMap<>();
 * 新增、刪除
 * put();
 * remove();
 * putAll();
 * clear();
 * 查詢
 * get(key)
 * containsKey(Key): 比較Key
 * containsKey(Values): 比較Values
 * size(); 長度
 * isEmpty()
 * equals(Object)
 * 操作
 * keySet()
 * Collectoin values()
 * entrySet()
 * 
 */

public class Demo01 {
	
	@Test
	public void test04() {
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("s", 10);
		map.put("a", 10);
		map.put("b", 10);
		map.put("x", 10);
		map.put("j", 10);
		map.put("p", 10);
		map.put("c", 10);
		
		System.out.println(map.firstKey());
		
		Set<String> set = map.keySet();
		for(Object obj1:set) {
			System.out.println(obj1+"---------------------->"+map.get(obj1));
		}
		
	}
	
	
	
	
	@Test
	public void test03() {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 10);
		map.put("d", 10);
		Set<String> set = map.keySet();
		for(Object obj1:set) {
			System.out.println(obj1+"---------------------->"+map.get(obj1));
		}
		
	}
	
	
	
	
	
	@Test
	public void test02() {
		Map<String,Person> map = new HashMap<>();
		
		map.put("a", new Person("Tom", 20));
		map.put("b", new Person("jason", 30));
		map.put("c", new Person("benson", 40));
		map.put("d", new Person("ande", 90));
		
		System.out.println(map.get("d"));
		
		
		Map<String,Person> map1 = new HashMap<>();
		
		map1.put("a1", new Person("Tom", 20));
		map1.put("b", new Person("jason", 30));
		map1.put("c", new Person("benson", 40));
		map1.put("d", new Person("ande", 90));
		
		
		map.putAll(map1);
		
		System.out.println("------------------------------");
		
		Set<String> obj = map.keySet();
		for(Object set:obj) {
			System.out.println(set);
		}
		
		System.out.println("---------------Collection<Person>-----------------");
		Collection<Person> col = map.values();
		Iterator<Person> it =  col.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------------");
		Set<String> set = map.keySet();
		for(Object obj1:set) {
			System.out.println(obj1+"---------------------->"+map.get(obj1));
		}
		
		
		
		
		
	}
	
	
	
	
	
	@Test
	public void test01() {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);
		
		System.out.println(map.get("a"));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
	}
}
