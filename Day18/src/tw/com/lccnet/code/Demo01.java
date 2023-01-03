package tw.com.lccnet.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import tw.com.lccnet.bean.Student;

public class Demo01 {
	
	
	@Test
	public void test03() {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"rioe","ri3o2@fdotwej"));
		list.add(new Student(2,"rioe","ri3o2@fdotwej"));
		list.add(new Student(3,"rioe","ri3o2@fdotwej"));
		list.add(new Student(4,"rioe","ri3o2@fdotwej"));
		
		
		
		List<Student> list1 = new ArrayList<>();
		
		list1.add(new Student(1,"rioe","ri3o2@fdotwej"));
		list1.add(new Student(2,"rioe","ri3o2@fdotwej"));
		list1.add(new Student(3,"rioe","ri3o2@fdotwej"));
		list1.add(new Student(4,"rioe","ri3o2@fdotwej"));
		
		list.addAll(list1);
		
		List<Student> li= list.subList(2, 5);//有頭無尾
		
		
		
		
		Iterator<Student> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	
	
	
	
	@Test
	public void test02() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		
		boolean x = list.contains(list1);//判斷list是否相同
		System.out.println(x);
		
		System.out.println(list.get(2));//取得list index位置的值
		
		//list.addAll(list1);//在原本的list後面，再加上另一個list
		//list.clear();
	
	
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	@Test
	public void test01() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		list.add(1,"b");//在陣列的1位置加上b
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
