package tw.com.lccnet.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

import tw.com.lccnet.bean.Student;

/*
 * 
 * List 索引值
 * SET 不重複
 * 
 * 如果要用set不重複，需再student 加入hashcode跟equals
 * 
 */




public class Demo03 {
	
	@Test
	public void test02() {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"rioe","ri3o2@fdotwej"));
		set.add(new Student(2,"rioe","ri3o2@fdotwej"));
		set.add(new Student(3,"rioe","ri3o2@fdotwej"));
		set.add(new Student(4,"rioe","ri3o2@fdotwej"));
		set.add(new Student(1,"rioe","ri3o2@fdotwej"));
		set.add(new Student(2,"rioe","ri3o2@fdotwej"));
		set.add(new Student(3,"rioe","ri3o2@fdotwej"));
		set.add(new Student(4,"rioe","ri3o2@fdotwej"));
		
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void test01() {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(10);
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
